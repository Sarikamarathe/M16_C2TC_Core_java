package com.indiabix.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 implements Runnable
{
	Main m;
	int a;
	String task;
     public Example1(Main m,int a,String task)
     {
    	  this.m=m;
    	  this.a=a;
    	  this.task=task;
     }
     public void run()
     {
    	 for(int i=0;i<3;i++)
    	 {
       		 System.out.println("Thread"+Thread.currentThread().getName());
    	 }
     }
}
class Main
{
	public void print()
	{
		ExecutorService t=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
   	 {
			
		 t.execute(new Example1(this, i+1, "task"+(i+1)));
   	 }	 
		t.shutdown();
	}
	void pause(double seconds)
	{
		try
		{
			Thread.sleep(Math.round(1000.0*seconds));
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occured"+e);
		}
	}
	public static void main(String[] args) {
		new Main().print();
	}

}
