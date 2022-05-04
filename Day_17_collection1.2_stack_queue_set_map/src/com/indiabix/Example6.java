package com.indiabix;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Sarika",2);
		m.put("Komal",3);
		System.out.println(m);
		m.remove("Sarika");
		System.out.println(m);

		
				
	}

}
