package com.socketTest.client;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10180885 on 16-1-8.
 */
public class TestClient {
    public static void main(String[] args) {
        new TestClient().start();
    }

    public void start() {
        try {
            String host = "127.0.0.1";//要连接的服务端IP地址
            int port = 52134;//要连接的服务端对应的监听端口
            //与服务端建立连接
            Socket client = new Socket(host, port);
            Writer writer = new OutputStreamWriter(client.getOutputStream());

            JSONObject json=new JSONObject();
            JSONArray jsonMembers = new JSONArray();
            JSONObject member1 = new JSONObject();
            List list = new ArrayList();
            list.add( "first" );
            list.add( "second" );
            jsonMembers = JSONArray.fromObject(list);
            json.put("test", jsonMembers);
            System.out.println(json);
            writer.write(json.toString());
            writer.flush();
            writer.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
