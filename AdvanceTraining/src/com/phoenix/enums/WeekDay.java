package com.phoenix.enums;

public enum WeekDay {

	Mon(20,"mon"),Tue(20),Wed,Thur,Fri(300,"fri"),Sat,Sun;
	private int day;
	public String shortName;
	
	private WeekDay()
	{
		day=-1;
		System.out.println("Default constructor");
	}
	
	WeekDay(int day)
	{
		this.day=day;
		System.out.println("Parameterized constructor");
	}
	
	WeekDay(int day,String shortName)
	{
		this.day=day;
		this.shortName=shortName;
		System.out.println("Parameterized constructor with 2 args");
	}
	
	public int getDayNo()
	{
		return day;
	}
}
