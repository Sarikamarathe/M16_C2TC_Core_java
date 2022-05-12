package com.indiabix.annotation;

import java.lang.reflect.Method;

@interface Annotation
{
	int sound();
}
class P
{
	@Annotation(sound=12)
	public void display()
	{
		System.out.println("Annotation");
	}
}

public class Example3 {

	public static void main(String[] args) throws NoSuchMethodException, RuntimeException {
		P p=new P();
		Method m=p.getClass().getMethod("display");
		Annotation a=m.getAnnotation(Annotation.class);
		System.out.println(a.sound());
	}

}
