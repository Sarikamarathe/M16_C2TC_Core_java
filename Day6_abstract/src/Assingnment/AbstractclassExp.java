package Assingnment;
abstract class animal
{
	animal()
	{
		System.out.println("all animals....");

	}
	 abstract void sound();
}
class Dog extends animal
{
	Dog()
	{
		super();
	}
	void sound()
	{
		System.out.println("this is Dog");

	}
}
class Lion extends animal
{
	Lion()
	{
		super();
	}
	void sound()
	{
		System.out.println("this is Lion");

	}
}
public class AbstractclassExp {

	public static void main(String[] args) {
		Dog d=new Dog();
		Lion l=new Lion();
		d.sound();
		l.sound();
	
	}

}
