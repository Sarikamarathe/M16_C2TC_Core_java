package com.indiabix.polymorphism;
class android
{
	void diplay()
	{
		System.out.println("Realme");
	}
}
class Apple extends android
{
	

	void diplay()
	{
		System.out.println("1+");
	}

	
	
}
class nokia extends android
{
	void diplay()
	{
		System.out.println("Nokia");
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {
		Apple a=new Apple();
		android c=new android();
		nokia n=new nokia();
		a.diplay();
		c.diplay();
		n.diplay();
		
	}

}
