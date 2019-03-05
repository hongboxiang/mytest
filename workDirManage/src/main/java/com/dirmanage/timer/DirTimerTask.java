package com.dirmanage.timer;

import com.dirmanage.context.DirContext;
import com.dirmanage.util.FileUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.time.LocalDate;
import java.util.TimerTask;

/**
 * Created on 19-3-4
 */
@Slf4j
public class DirTimerTask extends TimerTask {
    @Override
    public void run() {
        log.info("Start clean.");
        LocalDate today = LocalDate.now().minusDays(1);
        String desDir = DirContext.saveDir + File.separator + today.getYear()
                + File.separator + today.getMonthValue() + "月" + File.separator
                        + today.getDayOfMonth();
        File desFile = new File(desDir);
        if(!desFile.exists()){
            desFile.mkdirs();
        }
        FileUtil.moveDir(DirContext.deleteDir, desDir);
        log.info("Finish clean.");
    }
}
