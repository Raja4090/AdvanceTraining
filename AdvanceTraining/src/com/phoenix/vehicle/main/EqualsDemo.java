package com.phoenix.vehicle.main;

import com.phoenix.vehicle.Car;
/*
 * author:raja.kumar@stltech.in
 */
public class EqualsDemo extends Car {
	public static void main(String []args)
	{
	String s2=new String("Hello");
	Car c1=new Car(101,"tata",4500000.0f);
	if(c1.equals(s2))
    System.out.println("Same content");
	else
		System.out.println("Different Content");
		
	}
	}
	
