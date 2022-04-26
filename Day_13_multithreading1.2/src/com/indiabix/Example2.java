package com.indiabix;
class parent1 extends Thread

{
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("C2TC program");

		} catch (InterruptedException e) {
			System.out.println("Exception occurred");
			//e.printStackTrace();
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		parent1 p=new parent1();
		p.start();
		try
		{
			p.interrupt();
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}

}
