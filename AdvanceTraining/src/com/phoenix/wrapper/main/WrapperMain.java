package com.phoenix.wrapper.main;
/*
 * author:raja.kumar@stltech.in
 */
public class WrapperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer inr=Integer.valueOf(100);
		System.out.println("Object inr :"+inr);
		
		Boolean b1=Boolean.valueOf("Hello");
		System.out.println("Value of b1: "+b1);
		b1=Boolean.valueOf("True");
		System.out.println("Value of b1: "+b1);
		b1=Boolean.valueOf(true);
		System.out.println("Value of b1: "+b1);
		b1=Boolean.valueOf(false);
		System.out.println("Value of b1: "+b1);
		
		
		int n1=100;
		Integer wn1=n1; //Autoboxing
		System.out.println("value of wn1: "+wn1);
		n1=wn1+100;//AutoUnboxing
		System.out.println("Value of n1: "+n1);
		
		//important 1
		Float fno1=100.00f;
		/*if(wn1==fno1)      // Compiler error
			System.out.println("True");
		else
			System.out.println("False");
			*/
		
		//important 2
		if(wn1>=fno1)      
			System.out.println("True");
		else
			System.out.println("False");
		
		
		String str="10000";
		System.out.println("After adding 100: "+(Integer.parseInt(str)+100));
	}

}
