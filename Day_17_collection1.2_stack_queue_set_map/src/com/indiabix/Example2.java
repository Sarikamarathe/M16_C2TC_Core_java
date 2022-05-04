package com.indiabix;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		PriorityQueue obj=new PriorityQueue();
		obj.offer(7);//add element in queue
		obj.offer(2);
		obj.offer(5);
		System.out.println(obj);
		//obj.peek();//select particular element 
		//element()//element method is also peek the first element
		System.out.println(obj.peek());

	}

}
