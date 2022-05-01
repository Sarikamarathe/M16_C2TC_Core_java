package com.indiabixqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Eg1_Queue {

	public static void main(String[] args) {
		Queue<Integer>queue=new PriorityQueue<Integer>();
		queue.offer(4);
		queue.offer(8);
		queue.add(12);
		queue.add(16);
		queue.add(20);
		System.out.println(queue);
		System.out.println("the head is:"+queue.peek());


	}
	

}
