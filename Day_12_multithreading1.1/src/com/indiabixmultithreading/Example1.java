package com.indiabixmultithreading;

public class Example1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("current thread: "+t);
		try
		{
			Thread .sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}

}
