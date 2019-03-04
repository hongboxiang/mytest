package com.dirmanage.util;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Created on 19-3-4
 */
public class FileUtil {

    // 移动文件夹的方法,开始的时候是两个文件夹
    public static void moveDir(String source, String destin) throws IOException {
        copyFile(source, destin);
        deleteDir(source);
    }
    // 复制文件夹的方法,开始的时候是两个文件夹
    public static void copyFile(String source, String destin) throws IOException {
        File path1 = new File(source);
        File path2 = new File(destin);

        // 如果源目录不存在,那就不用复制了,
        if (path1.exists()) {
            // Create destination folder,如果目标目录不存在,就创建目标目录,因为没有目录文件复制不过去的
            if (!path2.exists()) {
                path2.mkdirs();
            }

            // 取得源目录下面的所有文件和文件夹
            File[] items = path1.listFiles();
            FileChannel in = null;
            FileChannel out = null;
            FileInputStream fis = null;
            FileOutputStream fos = null;

            // 取得所有文件和文件夹之后,遍历处理,如果是文件,就复制文件,如果是文件夹,则递归文件夹下面的文件和文件夹

            for (File item : items) {
                // 如果是文件才进行复制
                if (item.isFile()) {
                    // 输入输出流的两个常用构造函数,其中在用来了一个字段File.separator,先用输入流读取文件,然后用输出流写文件到目标位置,完成复制功能
                    try {
                        fis = new FileInputStream(item);
                        fos = new FileOutputStream(path2 + File.separator + item.getName());
                        in = fis.getChannel();//得到对应的文件通道
                        out = fos.getChannel();//得到对应的文件通道
                        in.transferTo(0, in.size(), out);//连接两个通道，并且从in通道读取，然后写入out通道
                    } catch (Exception e) {
                    } finally {
                        // close the Stream关闭资源啊,什么异常处理的就不写,自己补上吧
                        in.close();
                        out.close();
                    }
                }
                // 如果是文件夹,递归文件夹
                else {
                    copyFile(item.getPath(), path2 + File.separator + item.getName());
                }
            }
        } else {
            System.out.println("source path:" + source + " is not exists!");
        }
    }

    public static boolean deleteDir(String path){
        File file = new File(path);
        if(!file.exists()){//判断是否待删除目录是否存在
            System.err.println("The dir are not exists!");
            return false;
        }

        String[] content = file.list();//取得当前目录下所有文件和文件夹
        for(String name : content){
            File temp = new File(path, name);
            if(temp.isDirectory()){//判断是否是目录
                deleteDir(temp.getAbsolutePath());//递归调用，删除目录里的内容
                temp.delete();//删除空目录
            }else{
                if(!temp.delete()){//直接删除文件
                    System.err.println("Failed to delete " + name);
                }
            }
        }
        return true;
    }
}
