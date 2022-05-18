package com.indiabix.timedate;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		OffsetDateTime d=OffsetDateTime.now();
		OffsetTime o=OffsetTime.now();
		System.out.println(o);

		System.out.println(d);
	}

}
