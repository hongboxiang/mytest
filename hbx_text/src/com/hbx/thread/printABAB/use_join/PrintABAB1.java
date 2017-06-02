package com.hbx.thread.printABAB.use_join;

/**
 * Created by 10180885 on 16-2-27.
 */
public class PrintABAB1 {

    public static void main(String[] args) {
        printABAB();
    }

    public static void printABAB(){
        try {
            for (int i=0; i<10; i++) {
                Thread producer = new Thread(new Producer1());
                Thread comsumer = new Thread(new Consumer1());
                producer.start();
                producer.join();
                comsumer.start();
                comsumer.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
