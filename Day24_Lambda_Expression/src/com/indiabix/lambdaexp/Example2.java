package com.indiabix.lambdaexp;
interface B
{
	String dispaly(String str);
}
public class Example2 {

	public static void main(String[] args) {
		//lambda expression with return statement
		//Lambda expression with single parameter
		B b=(String str)->
		{
			//System.out.println("functional interface");
			return str;
		};
		System.out.println(b.dispaly("My name is sarika"));

	}

}
