package com.phoenix.inner;

/*author:raja.kumar@stltech.in
 * version:1.0
 * 
 */
    public  class Account {
       
	private String name;
	private int AccNo;
	private  float amount;
	public Account() {
		
	}
	public Account(int accNo, String name, float amount) {
		super();
		this.name = name;
		AccNo = accNo;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	 
	public void printDetails()
	{
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", AccNo=" + AccNo + ", amount=" + amount + "]";
	}
	
	
	//inner class
	public class Locker
	{
	    int lockerId;
	    
	    public Locker(int lockerId)
	    {
	    	this.lockerId=lockerId;
	    }
	    public void show()
	    {
	    	System.out.println("Locker Id: "+lockerId);
	    }
	}//end of inner class
	
} //end of outer class
