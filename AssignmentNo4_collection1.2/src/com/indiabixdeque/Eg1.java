package com.indiabixdeque;

import java.util.ArrayDeque;

public class Eg1 {

	public static void main(String[] args) {
		ArrayDeque<String>deque=new ArrayDeque<String>();
		deque.add("day");
		deque.addFirst("each");
		deque.addLast("your");
		deque.addFirst("make");
		deque.add("masterprice");
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		System.out.println(deque.peek());






	}

}
