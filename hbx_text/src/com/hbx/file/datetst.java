package com.hbx.file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 10180885 on 2016/8/19.
 */
public class datetst
{
    public static void main(String[] args) {

        String time = "20160817153335785";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        while (true) {
            String ss = sdf1.format(new Date());
            if(ss.length() == 15) {
                System.out.println(ss);
                break;
            }
        }
//        System.out.println(sdf1.format(new Date()));

//        String time = "20160817153335785";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmssSSS");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
//        try {
//            System.out.println(sdf2.format(sdf1.parse(time)));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        try {
//            currentTime = formatter.parse(ss);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        String dateString = formatter.format(currentTime);
//        System.out.println(dateString);
    }
}
