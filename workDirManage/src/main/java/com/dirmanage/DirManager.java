package com.dirmanage;

import com.dirmanage.context.DirContext;
import com.dirmanage.context.DirLoader;
import com.dirmanage.timer.DirTimerTask;
import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created on 19-3-4
 */
@Slf4j
public class DirManager {
    static {
        DirLoader.load();
    }

    public static void dirTransfer(){
        Date time = getTime();
        new Timer().schedule(new DirTimerTask(), time);
    }

    private static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, DirContext.hourOfDay);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        log.info("DirManager startup.");
        dirTransfer();
    }
}
