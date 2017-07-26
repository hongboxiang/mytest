package com.hbx.collection.list;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 10180885 on 2017/2/8.
 */
public class listTest {

    private static List<String> ppuIdFDDList;

    private static List<String> ppuIdTDDList;

    public static void main(String[] args)  {
        ppuIdFDDList = new ArrayList<>();
//        ppuIdFDDList.add("1");
//        ppuIdFDDList.add("2");

        ppuIdTDDList = new ArrayList<>();
//        ppuIdTDDList.add("1");

//        testRetailAll(ppuIdFDDList, ppuIdTDDList);

        System.out.println(ppuIdFDDList.isEmpty());
        System.out.println(ppuIdTDDList);
    }

    private static void testRetailAll(List<String> ppuIdFDDList, List<String> ppuIdTDDList) {
        List<String> ppuIdFTLList = new ArrayList<String>(ppuIdFDDList);
        ppuIdFDDList.retainAll(ppuIdTDDList);
        System.out.println("FTL: ");
        System.out.println(ppuIdFDDList);
    }
}
