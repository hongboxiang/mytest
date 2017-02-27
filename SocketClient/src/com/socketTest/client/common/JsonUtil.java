package com.socketTest.client.common;

import net.sf.json.JSONArray;

import java.util.List;

/**
 * Created by 10180885 on 16-1-11.
 */
public class JsonUtil {
    public static void ListToJSON(List list){
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println( jsonArray );
    }
}
