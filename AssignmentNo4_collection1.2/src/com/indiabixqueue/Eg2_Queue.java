package com.indiabixqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Eg2_Queue {

	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
