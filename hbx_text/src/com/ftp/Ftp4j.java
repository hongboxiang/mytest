package com.ftp;

import java.io.File;
import com.zte.ums.thirdparty.it.sauronsoftware.ftp4j.FTPClient;

/**
 * Created on 2018/6/7
 */
public class Ftp4j {

    private final FTPClient fc;

    public Ftp4j(String host, int port, int type, String user, String password) throws Exception {
        fc = new FTPClient();
        fc.setSecurity(type);
        fc.connect(host, port);
        try {
            fc.login(user, password);
        } catch (Exception e) {
            fc.disconnect(false);
            throw e;
        }
    }

    public boolean isPassive() throws Exception {
        return fc.isPassive();
    }

    public void get(String remote, String local) throws Exception {
        fc.download(remote, new File(local));
    }

    public void put(String local, String remote) throws Exception {
        File remoteFile = new File(remote);
        File localFile = new File(local);
        String parent = remoteFile.getParent();
        if (parent != null) {
            try {
                fc.changeDirectory(parent);
            } catch (Exception e1) {
                fc.createDirectory(parent);
                fc.changeDirectory(parent);
            }
        }
        fc.upload(localFile);
        if (!localFile.getName().equalsIgnoreCase(remoteFile.getName())) {
            try {
                fc.rename(localFile.getName(), remoteFile.getName());
            } catch (Exception e) {
                fc.deleteFile(localFile.getName());
                throw e;
            }
        }
    }

    public void quit() {
        if (fc != null) {
            try {
                fc.disconnect(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
