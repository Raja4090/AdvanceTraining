package com.phoenix.hashcode.demo;

import com.phoenix.vehicle.Car;

public class HashCodeDemo {

	public static void main(String[]args)
	{
		String s1="Hello";
		String s2=new String("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Car c1=new Car(101,"Tata",45000.0f);
		Car c2=new Car(102,"Tata",45000.0f);
		System.out.println(c1.hashCode()+"\n"+c2.hashCode());
	}
	
}
