package com.phoenix.vehicle;

import com.phoenix.annotations.CopyRightInfo;

/*author:raja.kumar@stltech.in
 * 
 *
 */
@CopyRightInfo(author="raja.kumar@stltech.in",version=2.0)
public class Car {
  private int id;
  private String model;
  private float price;
  public static int count=0;
  
  public Car()
  {
	  count++;
  }
  public Car(int id, String model, float price) {
	super();
	this.id = id;
	this.model = model;
	this.price = price;
  }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price+"]";
	}
	
	
	public boolean equals(Object ob)
	{
		if(ob instanceof Car)
		{
			Car car=(Car)ob;
			if(this.id==car.id && this.model.equals(car.model) 
					&& this.price==car.price)
				return true;
		
		}
			
		else
			return false;
		return false;
	}
	
	public int hashCode()
	{
		return id+model.hashCode()+(int)price;
	}
	  
}
