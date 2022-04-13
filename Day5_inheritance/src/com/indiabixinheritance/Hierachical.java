package com.indiabixinheritance;

class vehicle{
	void print() {
		System.out.printf("this is vehicle");
	}
}
class car extends vehicle{
	void display(){
		System.out.printf("this is car");

	}
}
class bike extends vehicle{
	void accept(){
		System.out.printf("\nthis is bike");

	}
}
public class Hierachical {

	public static void main(String[] args) {
		car c=new car();
		bike b=new bike();
		c.display();
		b.accept();

	}

}
