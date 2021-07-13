package com.phoenix.inner;

/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */
public class StaticInner {

	public void PrintOuter()
	{
		System.out.println("This is outer class method...!"+"\nouter seconds:"+a);
	}
	static int a=100;
	
	//inner class
	public static class Inner{
		static int a=200;
		public void init()
		{
			System.out.println("Inner class getting initialized....!\n"+""
					+ "seconds: "+a);
			
		}
		
	}//end of inner
}//end of outer
