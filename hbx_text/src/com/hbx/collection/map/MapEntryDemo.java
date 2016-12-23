package com.hbx.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*Map类提供了一个称为entrySet()的方法，这个方法返回一个Map.Entry实例化后的对象集。
接着，Map.Entry类提供了一个getKey()方法和一个getValue()方法，因此，上面的代码可以被组织得更符合逻辑*/
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
