package com.indiabix.lambdaexp;
interface D
{
	int mul(int a,int b);
	
}

public class Example5 {

	public static void main(String[] args) {
		//Lambda expression without return
		D d=(int a,int b)->(a*b);
		System.out.println("multiflication of a and b " +d.mul(13, 17));

	}

}
