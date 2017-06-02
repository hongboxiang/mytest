package com.ftpDLog.util;

import com.jcraft.jsch.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.net.SocketException;
import java.util.Properties;

/**
 * Created by 10180885 on 2016/8/1.
 */
public class FtpUtil {
    private static String userName;         //FTP ��¼�û���
    private static String password;         //FTP ��¼����
    private static String ip;                     //FTP ��������ַIP��ַ
    private static int port;                        //FTP �˿�
    private static String ftptype;
    private static FTPClient ftp = null; //FTP �ͻ��˴���
    private static ChannelSftp sftp = null;

    public static void setArg() {
        ip = PropertiesUtil.getKeyValue(PropertiesUtil.IP);
        port = Integer.valueOf(PropertiesUtil.getKeyValue(PropertiesUtil.PORT));
        userName = PropertiesUtil.getKeyValue(PropertiesUtil.USERNAME);
        password = PropertiesUtil.getKeyValue(PropertiesUtil.PASSWORD);
        ftptype = PropertiesUtil.getKeyValue(PropertiesUtil.FTPTYPE);

    }

    public static boolean connectToFtp() {
        boolean flag = true;
        if (ftp == null) {
            int reply;
            try {
                setArg();
                ftp = new FTPClient();
                ftp.connect(ip, port);
                ftp.login(userName, password);
                reply = ftp.getReplyCode();
                ftp.setDataTimeout(120000);

                if (!FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    System.err.println("FTP server refused connection.");
                    // logger.debug("FTP ����ܾ����ӣ�");
                    flag = false;
                }
            } catch (SocketException e) {
                flag = false;
                e.printStackTrace();
                System.err.println("��¼ftp������ " + ip + " ʧ��,���ӳ�ʱ��");
            } catch (IOException e) {
                flag = false;
                e.printStackTrace();
                System.err.println("��¼ftp������ " + ip + " ʧ�ܣ�FTP�������޷��򿪣�");
            }
        }
        return flag;
    }

    public static boolean connect2Sftp() {
        boolean flag = false;
        try {
            setArg();
            JSch jsch = new JSch();
            Session session = jsch.getSession(userName, ip, port);
            session.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            session.setConfig(sshConfig);
            session.connect();
            Channel channel = session.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
            flag = true;
        } catch (JSchException e) {
            e.printStackTrace();
        }
        return flag;
    }

}
