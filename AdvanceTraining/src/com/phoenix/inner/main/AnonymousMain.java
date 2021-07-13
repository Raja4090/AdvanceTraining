package com.phoenix.inner.main;

import com.phoenix.inner.AnonymousInner;


/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */

interface Sample{
	void record();
}
public class AnonymousMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AnonymousInner anon=new AnonymousInner() {
		    public void show()
			{
				System.out.println("Anonymous1 is created..");
			}
		};
	
		anon.show();
		
		Sample obj=new Sample() {
			public void record()
			{
				System.out.println("This is super1");
			}
		};
		obj.record();
	}	
}
