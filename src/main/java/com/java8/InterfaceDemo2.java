package com.java8;

public interface InterfaceDemo2 {
	
	public int getLength(String str);
	
	default void getLength(int str2) {
		System.out.println("Inside default void getLength():"+str2);
	}
}
