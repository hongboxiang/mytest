package com.hbx.file;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * Created by 10180885 on 15-6-26.
 */
public class clearmarkProblem
{
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("D://test.txt");
        Writer writer = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);


        bufferedWriter.write("bufferedWriter");
        SimpleDateFormat time=new SimpleDateFormat("yyyy MM dd HH mm ss");
        System.out.println(time.format(file.lastModified()));
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                File file1 = new File("D://test.txt");
//                if(file1.length() == 0) {
//                    System.out.println(file1.length());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    file1.delete();
//                }
//            }
//        }).start();
//
//        Thread.sleep(500);

        bufferedWriter.close();


//        try {
//            File outFile = new File(outputPath);
//            File DD = new File("");
//            writer = new FileWriter(DD);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            eEmptyTemplate.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void deleteLiveBackupCSV(String backupId) {
        String BACKUP_PATH = "D:\\";
        String deletePath = BACKUP_PATH.concat(backupId).concat(".").concat("zip");
        File deleteFile = new File(deletePath);
        if (deleteFile.exists()) {
            try {
                FileUtils.forceDelete(deleteFile);
            } catch (IOException e) {
//                LOGGER.info("The CSV file not exists!");
            }
        }

    }

}
