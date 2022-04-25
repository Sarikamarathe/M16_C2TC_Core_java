package com.indiabixexception;

public class ex2 
{
	public void display(int age,int weight)
	{
		if(age>18 || weight<50)
		{
			System.out.println("eligible to donate the blood");
		}
		else
		{
			throw new ArithmeticException("not eligible");

		}
	}
	public static void main(String[] args) {
		ex2 e=new ex2();
	}

}
