package com.phoenix.inner.main;

import com.phoenix.inner.Account;

/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */
public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account ac=new Account(123456789,"Hrithik",45000000000.0f);
       ac.printDetails();
       
       Account.Locker locker=ac.new Locker(456);
       locker.show();
       
	}

}
