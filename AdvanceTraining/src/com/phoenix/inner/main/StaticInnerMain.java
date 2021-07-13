package com.phoenix.inner.main;

import com.phoenix.inner.StaticInner;

/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */
public class StaticInnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInner obj=new StaticInner();
		obj.PrintOuter();
		
		StaticInner.Inner inner=new StaticInner.Inner();
        inner.init();
	}

}
