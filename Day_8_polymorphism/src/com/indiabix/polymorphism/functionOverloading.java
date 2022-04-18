package com.indiabix.polymorphism;


class shape
{
	void print(int a,int b)
	{
		System.out.println(a+b);
	}
	void print(float a,float b)
	{
		System.out.println(a*b);
	}
	void print(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
}
public class functionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new shape();
		s.print(10,20);
		s.print(3.4f, 37.4f);
		s.print(10, 20,30);
	}

}
