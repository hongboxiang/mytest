package com.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 10180885 on 2017/1/6.
 */
/*
 * ���������
 */
public class WeatherServer{

    public static void main(String[] args) throws IOException {

        // 1.����ServerSocket����
        ServerSocket serverSocket = new ServerSocket(12345);

        while(true){

            // 2.�ȴ��ͻ������ӣ������ķ���
            final Socket socket = serverSocket.accept();

            Runnable runnable = new Runnable(){
                @Override
                public void run(){
                    try{
                        // 3.ʹ�����������ܿͻ��˷��͵�����
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String cityName = dis.readUTF();
                        System.out.println("���յ��ͻ��˷��͵�����: " + cityName);

                        Thread.sleep(1000);

                        // 4.���ݳ�������ѯ����
                        String result = "������������";
                        System.out.println("����������Ϣ: " + result);

                        // 5.���ز�ѯ�����ʹ���������
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(result);

                        // 6.�ر���
                        dis.close();
                        dos.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            };

            //�����߳�
            new Thread(runnable).start();

        }
    }
}