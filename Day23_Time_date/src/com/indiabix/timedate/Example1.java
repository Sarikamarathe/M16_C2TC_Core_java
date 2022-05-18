package com.indiabix.timedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuppressWarnings("unused")
public class Example1 {

	public static void main(String[] args) {
		//LocalDate d=LocalDate.now();//date
		//LocalTime t=LocalTime.now();//
		LocalDateTime l=LocalDateTime.now();
		LocalDate obj=LocalDate.of(2022,2,28);
		//System.out.println(d);
		//System.out.println(t);
		System.out.println(l);
		System.out.println(obj);

	}

}
