package com.indiabix.timedate;

import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(t);
		//LocalDateTime df=LocaldateTime.now();
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
