package com.hbx.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Map���ṩ��һ����ΪentrySet()�ķ����������������һ��Map.Entryʵ������Ķ��󼯡�
���ţ�Map.Entry���ṩ��һ��getKey()������һ��getValue()��������ˣ�����Ĵ�����Ա���֯�ø������߼�*/
public class MapEntryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();  
		map.put("one".toString(), 1);   
		map.put("two".toString(), 2);   
		map.put("three".toString(), 3);   
		Iterator<Entry<String, Integer>> itor=map.entrySet().iterator();
		while(itor.hasNext()){   
		  Map.Entry<String,Integer> entry=itor.next();
		  System.out.println("key="+entry.getKey().toString());   
		  System.out.println("values="+entry.getValue().toString());   
		} 

	}

}
