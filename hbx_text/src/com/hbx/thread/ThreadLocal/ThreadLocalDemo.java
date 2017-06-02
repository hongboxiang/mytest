package com.hbx.thread.ThreadLocal;

/**
 * Created by 10180885 on 2016/8/25.
 */
public class ThreadLocalDemo {
    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public int vvv;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread1(i)).start();
        }
    }

    static class MyThread implements Runnable{
        private int index;

        public MyThread(int index){
            this.index = index;
        }
        @Override
        public void run() {
            System.out.println("�߳�" + index + "�ĳ�ʼvalue:" + value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + 1);
            }
            System.out.println("�߳�" + index + "���ۼ�value:" + value.get());
        }
    }

    static class MyThread1 implements Runnable{
        private int index;
        public int vvv;

        public MyThread1(int index){
            this.index = index;
        }
        @Override
        public void run() {
            System.out.println("�߳�" + index + "�ĳ�ʼvalue:" + vvv);
            for (int i = 0; i < 10; i++) {
                vvv++;
            }
            System.out.println("�߳�" + index + "���ۼ�value:" + vvv);
        }
    }
}
