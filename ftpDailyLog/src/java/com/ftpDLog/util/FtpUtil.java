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
    private static String userName;         //FTP 登录用户名
    private static String password;         //FTP 登录密码
    private static String ip;                     //FTP 服务器地址IP地址
    private static int port;                        //FTP 端口
    private static String ftptype;
    private static FTPClient ftp = null; //FTP 客户端代理
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
                    // logger.debug("FTP 服务拒绝连接！");
                    flag = false;
                }
            } catch (SocketException e) {
                flag = false;
                e.printStackTrace();
                System.err.println("登录ftp服务器 " + ip + " 失败,连接超时！");
            } catch (IOException e) {
                flag = false;
                e.printStackTrace();
                System.err.println("登录ftp服务器 " + ip + " 失败，FTP服务器无法打开！");
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
