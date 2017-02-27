package com.socketTest.server;


import net.sf.json.JSONObject;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * Created by 10180885 on 16-1-8.
 */
public class TestServer {
    public static void main(String[] args) {
        new TestServer().start();
    }

    public void start() {
        try {
            int port = 52134;//要连接的服务端对应的监听端口
            //定义一个ServerSocket监听在端口8899上
            ServerSocket server = new ServerSocket(port);
            //server尝试接收其他Socket的连接请求，server的accept方法是阻塞式的
            System.out.println("start accept: ");
            Socket socket = server.accept();
            //跟客户端建立好连接之后，我们就可以获取socket的InputStream，并从中读取客户端发过来的信息
            char chars[] = new char[64];
            int len;
            StringBuffer sb = new StringBuffer();
            Reader reader = new InputStreamReader(socket.getInputStream());
            while((len=reader.read(chars)) != -1){
                sb.append(new String(chars, 0, len));
            }
            System.out.println("from client: " + sb);

            JSONObject jsonObject = JSONObject.fromObject(sb.toString());
            List list = (List)jsonObject.getJSONArray("test");

            System.out.println(list);
            System.out.println("list.get(0)" + list.get(0));
            System.out.println("list.get(1)" + list.get(1));
            reader.close();
            socket.close();
            server.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
