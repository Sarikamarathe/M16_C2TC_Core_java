package com.indiabix.enum1;
enum Bike
{
	Pulser,KTM,R3,R15;
}
public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.KTM;
		switch(b)
		{
		case Pulser:
			System.out.println("you choose Pulser");
			break;
		case KTM:
			System.out.println("you choose KTM");
			break;
		case R3:
			System.out.println("you choose R3");
			break;
		case R15:
			System.out.println("you choose R15");
			break;
			default:
				System.out.println("Invalid name");

		}
	}

}
