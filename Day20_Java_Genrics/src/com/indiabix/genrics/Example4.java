package com.indiabix.genrics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer,Integer>j=new HashMap<Integer,Integer>();
		j.put(1, 123);
		j.put(2, 456);
		System.out.println(j);
		Set<Entry<Integer,Integer>>j1=j.entrySet();
		Iterator<Map.Entry<Integer,Integer>>itr=j1.iterator();
		while(itr.hasNext())
		{
			Map.Entry e1=itr.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}

}
