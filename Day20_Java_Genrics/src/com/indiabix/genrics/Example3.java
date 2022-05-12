package com.indiabix.genrics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("sarika");
		s.add("Komal");
		String b=s.get(1);
		System.out.println(b);
		Iterator<String>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.hasNext());

		}
		
	}

}
