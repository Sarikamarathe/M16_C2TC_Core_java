package com.indiabix.lambdaexp;
interface C
{
	int add(int a,int b);
}
public class Example3 {

	public static void main(String[] args) {
		C c=(int a,int b)->
		{
			//System.out.println("The addition of a and b: "+(a+b));
			return a+b;

		};
		System.out.println("The addition of a and b: "+c.add(10,20));

	}

}
