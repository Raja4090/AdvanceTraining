package com.phoenix.inner;

/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */
public class LocalInner {
	
	public void printOut()
	{
		System.out.println("Outer class method");
		
	       class Inner{
		   
		   void show()
		   {
			   System.out.println("This is inner class method");
		   }
		   
	   };//end of inner class
	   
	   Inner obj=new Inner();
	   obj.show();
	   
	}//end of method

}//end of outer
