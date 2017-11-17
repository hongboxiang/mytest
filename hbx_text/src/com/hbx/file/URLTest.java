package com.hbx.file;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10180885 on 2017/5/15.
 */
public class URLTest {
    public static final String FTP_FORMAT = "^((app=ftp|app=sftp)://)([a-zA-Z0-9_-])+:([a-zA-Z0-9_-])*@((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.){3}((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])){1}(:[0-9]+)?(\\/([0-9a-zA-Z]*))*$";

    public static void main(String[] args) throws MalformedURLException {
        List<Integer> list = new ArrayList<Integer>();
        testGroup();
    }

    private static void testftp() throws MalformedURLException {
        java.net.URL url = new java.net.URL("ftp://root:LteSon123@10.92.243.27:22/quickconfigRFData");
        System.out.println("URL 为：" + url.toString());
        System.out.println("协议为：" + url.getProtocol());
        System.out.println("验证信息：" + url.getUserInfo());
        System.out.println("文件名及请求参数：" + url.getFile());
        System.out.println("主机名：" + url.getHost());
        System.out.println("路径：" + url.getPath());
        System.out.println("端口：" + url.getPort());
        System.out.println("默认端口：" + url.getDefaultPort());
        System.out.println("请求参数：" + url.getQuery());
        System.out.println("定位位置：" + url.getRef());
    }

    private static void testGroup() {
        Pattern pattern = Pattern.compile(FTP_FORMAT);
        Matcher matcher = pattern.matcher("app=sftp://root:LteSon123@10.92.243.27:22/quickconfigRFData");
        System.out.println(matcher.matches());
        System.out.println(matcher.group());
    }
}
