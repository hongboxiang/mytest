package com.hbx.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by 10180885 on 16-2-4.
 */
public class testet {
    public static int a = 0;

    public static void main(String[] args) {
        System.out.println(isTempDir(new File("D:\\myPlays\\EMSRM\\10.92.243.27(OMMOID=jk679cq4-1)\\20180729_103758\\ALL_20180729_103701_1")));
    }

    public static boolean isTempDir(File file) {
        return file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".csv");
            }
        }).length != 0;
    }
}
