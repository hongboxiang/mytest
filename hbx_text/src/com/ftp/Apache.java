package com.ftp;

import org.apache.commons.net.ftp.FTPClient;

import java.io.*;

/**
 * Created on 2018/6/7
 */
public class Apache {
    /** FTP ¿Í»§¶Ë */
    private FTPClient fc = null;

    public Apache(String host, int port, int type, String user, String password) throws IOException {
        fc = new FTPClient();
        fc.enterLocalPassiveMode();
        System.out.println("fc1:" + fc.getDataConnectionMode());
        fc.connect(host, port);
        System.out.println("fc2:" + fc.getDataConnectionMode());
        fc.enterLocalPassiveMode();
        System.out.println("fc3:" + fc.getDataConnectionMode());
        try {
            if (!fc.login(user, password)) {
                throw new IOException("FTP connection failed.");
            }
            System.out.println("fc4:" + fc.getDataConnectionMode());
            if (!fc.setFileType(FTPClient.BINARY_FILE_TYPE)) {
                throw new IOException("Set binary transfer type failed.");
            }
            System.out.println("fc3:" + fc.getDataConnectionMode());
        } catch (IOException e) {
            quit();
            throw e;
        }
    }

    public int getDataConnectionMode(){
        return fc.getDataConnectionMode();
    }

    public void get(String remote, String local) throws IOException {
        FileOutputStream fos = null;
        String fileName = remote;
        try {
            if (remote.indexOf(File.separator) != -1) {
                String destFolder = remote.substring(0, remote.lastIndexOf(File.separator));
                fileName = remote.substring(remote.lastIndexOf(File.separator));
                fc.changeWorkingDirectory(destFolder);
            }
            File localFile = new File(local);
            fos = new FileOutputStream(localFile);
            if (!fc.retrieveFile(fileName, fos)) {
                closeStream(fos);
                localFile.delete();
                throw new IOException("Failed to download file.");
            }
        } finally {
            closeStream(fos);
        }
    }

    public void put(String local, String remote) throws IOException {
        File remoteFile = new File(remote);
        File localFile = new File(local);
        FileInputStream fis = null;
        try {
            changeRemoteWorkingDir(remoteFile);
            fis = new FileInputStream(localFile);
            if (fc.storeFile(remoteFile.getName(), fis)) {
                throw new IOException("Failed to download file.");
            }
            renameRemoteFileName(remoteFile, localFile);
        } finally {
            closeStream(fis);
        }
    }

    private void changeRemoteWorkingDir(File remoteFile) throws IOException {
        String parent = remoteFile.getParent();
        if (parent != null) {
            if (!fc.changeWorkingDirectory(parent)) {
                if (!fc.makeDirectory(parent)) {
                } else {
                    fc.changeWorkingDirectory(parent);
                }
            }
        }
    }

    private void renameRemoteFileName(File remoteFile, File localFile) throws IOException {
        if (!localFile.getName().equalsIgnoreCase(remoteFile.getName())) {
            try {
                if(!fc.rename(localFile.getName(), remoteFile.getName())) {
                    throw new IOException("Failed to rename file.");
                }
            } catch (IOException e) {
                fc.deleteFile(localFile.getName());
                throw e;
            }
        }
    }

    public void quit() {
        if (fc != null && fc.isConnected()) {
            try {
                fc.logout();
                fc.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
