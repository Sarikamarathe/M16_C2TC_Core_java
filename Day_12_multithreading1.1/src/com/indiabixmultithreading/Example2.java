package com.indiabixmultithreading;
class A extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
}
public class Example2 
{

	public static void main(String[] args) {
		A a=new A();
		a.start();//automatically called run()
		//a.run();
	}

}
