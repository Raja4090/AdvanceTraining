package com.phoenix.string.main;

public class StringBufferMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer sb=new StringBuffer();
      sb.insert(0, "Raja");
      System.out.println(sb);
      System.out.println("Capacity: "+sb.capacity());
      System.out.println("Length:"+sb.length());
      System.out.println("Reverse: "+sb.reverse());
      System.out.println("Replace R: "+sb.replace(0, 1, "My name is a"));
     
      
	}

}
