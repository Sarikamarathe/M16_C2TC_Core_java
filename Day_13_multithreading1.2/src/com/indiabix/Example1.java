package com.indiabix;

class parent 
{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=num;i++)
			{
				System.out.println(num*i);
			}
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
class child extends Thread
{
	parent p;
	child(parent p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print(10);
	}
}
class child1 extends Thread
{
	parent p1;
	child1(parent p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.print(20);
	}
}

	public static void main(String[] args) {
		parent pp=new parent();
		child c1=new child(pp);
		child1 c2=new child1(pp);
		c1.start();
		c2.start();
	}

}
