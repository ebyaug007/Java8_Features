package com.java.features.functional;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> tablemap = new Hashtable<>();
		tablemap.put("anc", null);
		
		
		Map<String,String> map = new HashMap();
		map.put(null, null);
		map.put("abc", "12");
		map.put("abc", "sdfasdf");
		
		for (Map.Entry<String,String> s : map.entrySet())
			System.out.println(s.getKey() + ":::" + s.getValue());
		
		System.out.println(map);
		
		/*------------------------*/
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("B");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			String elt = it.next();
			System.out.println(elt);
			list.add("C");
		}

		System.out.println(list);
	}

}
