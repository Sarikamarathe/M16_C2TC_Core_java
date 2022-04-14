package com.indiabix.absract;
class parent{
	final void print() {
		System.out.println("hello");
	}
}
class child extends parent{
	void print1() {
		System.out.println("sarika");

	}
    
}
public class finalKeyword {


	public static void main(String[] args) {
	  
		child c=new child();
		c.print();
		c.print1();
		
		
	}

}
