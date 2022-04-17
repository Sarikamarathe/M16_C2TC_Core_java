package com.indiabix;

public class Example3 {
	public Example3(String string) {
	}
	void accept(Example3 obj)
	{
		
	}
	void display()
	{
		accept(this);
	}

	public static void main(String[] args) {
		Example3 e=new Example3("welocme to C2TC program");
		e.accept(e);
	}

}
