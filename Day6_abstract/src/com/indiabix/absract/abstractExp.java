package com.indiabix.absract;

abstract class A{
	abstract void print();
	void dispaly() {
		System.out.println("hello");

	}
}
class B extends A{
	void print() {
		System.out.println("sarika");
	}
}
public class abstractExp {

	public static void main(String[] args) {
		B a=new B();
		a.print();
		a.dispaly();

	}

}
