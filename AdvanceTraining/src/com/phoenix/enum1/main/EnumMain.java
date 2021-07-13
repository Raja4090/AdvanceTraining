package com.phoenix.enum1.main;

import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Color: "+Color.RED);
		System.out.println("Ordinal value for Blue: "+Color.BLUE.ordinal());
		Color c=Color.BLACK;
		System.out.println(c);
		
		System.out.println("Total color:\n");
		for(Color color:Color.values())
			System.out.println(color);
		
		
		System.out.println("\n\nDay: "+WeekDay.Tue);
		System.out.println("Ordinal of Tue: "+WeekDay.Tue.ordinal());
		
		System.out.println("\n\nTotal days: ");
		for(WeekDay wd:WeekDay.values())
			System.out.println(wd);
		
		System.out.println("\n\nUsing Switch:");
		WeekDay wd=WeekDay.Tue;
		switch(wd)
		{
		case Mon: System.out.println("Day 1");
		break;
		case Tue: System.out.println("Day 2");
		break;
		case Wed: System.out.println("Day 3");
		break;
		case Thur: System.out.println("Day 4");
		break;
		case Fri: System.out.println("Day 5");
		break;
		case Sat: System.out.println("Day 6");
		break;
		case Sun: System.out.println("Day 7");
		break;
		}
		
	
		System.out.println("\n\nTue day no: "+WeekDay.Tue.getDayNo());
		WeekDay wd1=WeekDay.Mon;
		System.out.println("Day: "+wd1);
		System.out.println("Day No: "+wd1.getDayNo());
		System.out.println("Short Name: "+wd1.shortName);
	}

}
