package com.indiabix;

public class Example2 {

	String str;
	Example2()
	{
		
	}
	Example2(String str)
	{
		this.str=str;
	}
	
	public static void main(String[] args) {
		Example2 e=new Example2("full stack developer");
		System.out.println(e.str);

	}

}
