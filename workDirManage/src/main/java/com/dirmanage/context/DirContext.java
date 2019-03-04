package com.dirmanage.context;

import lombok.Getter;
import lombok.Setter;

/**
 * Created on 2019/3/2
 */
@Getter
@Setter
public class DirContext {
    public static String saveDir;
    public static String deleteDir;
    public static int hourOfDay;

    private static class DirContextHolder {
        private volatile static DirContext dirContext = new DirContext();
    }

    public static DirContext getInstance() {
        return DirContextHolder.dirContext;
    }


}
