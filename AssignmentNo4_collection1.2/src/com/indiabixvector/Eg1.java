package com.indiabixvector;

import java.util.Vector;

public class Eg1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add("Animal");
		v.add("flower");
		v.add(3);
		v.setElementAt(4,1);
		System.out.println(v);
	}

}
