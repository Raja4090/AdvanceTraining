package com.phoenix.statics.imports.main;
import static java.lang.Integer.parseInt;

import com.phoenix.vehicle.Car;

import static com.phoenix.vehicle.Car.count;
public class StaticImportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=parseInt("20");
		System.out.println(a);
		
		int b=parseInt("100");
		System.out.println(b);
		System.out.println("No of Objects: "+Car.count);
		Car c1=new Car();
		Car c2=new Car(121,"Mercedez benz",450000.0f);
		
		System.out.println("No of Objects: "+Car.count);
	}

}
