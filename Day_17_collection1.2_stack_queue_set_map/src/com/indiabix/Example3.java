package com.indiabix;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example3 {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(3);
		d.add("Sarika");
		System.out.println(d);
		d.addLast("Komal");
		d.addFirst(10);
		System.out.println(d);
		d.removeLast();
		System.out.println(d);

	}

}
