package com.indiabixWrapper;
class A
{
	void add()
	{
		int a=10,b=30,c;
		c=a+b;
		System.out.println(c);
	}

	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}

	void add(int x,double y)
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
}
public class eg3 {

	public static void main(String[] args) {
		A a=new A();
		a.add();
		a.add(100, 200);
		a.add(20,34.50);
	}

}
