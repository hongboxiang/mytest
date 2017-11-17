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
        System.out.println("URL Ϊ��" + url.toString());
        System.out.println("Э��Ϊ��" + url.getProtocol());
        System.out.println("��֤��Ϣ��" + url.getUserInfo());
        System.out.println("�ļ��������������" + url.getFile());
        System.out.println("��������" + url.getHost());
        System.out.println("·����" + url.getPath());
        System.out.println("�˿ڣ�" + url.getPort());
        System.out.println("Ĭ�϶˿ڣ�" + url.getDefaultPort());
        System.out.println("���������" + url.getQuery());
        System.out.println("��λλ�ã�" + url.getRef());
    }

    private static void testGroup() {
        Pattern pattern = Pattern.compile(FTP_FORMAT);
        Matcher matcher = pattern.matcher("app=sftp://root:LteSon123@10.92.243.27:22/quickconfigRFData");
        System.out.println(matcher.matches());
        System.out.println(matcher.group());
    }
}
