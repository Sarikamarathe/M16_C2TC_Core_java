package com.indiabix.lambdaexp;
			//no parameter
interface A
{
	void show();//functional interface which contains only one abstract method
	
}
/*class B implements  A
{
	public void show()
	{
		System.out.println("functional interface");
	}
}*/
public class Example1 {

	public static void main(String[] args) {
		//lambda expression with no parameter
		A b=()->
		{
			System.out.println("Functional Interface");

		};
		b.show();//to reduce the line of code is called lambda
	}

}
