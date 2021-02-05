package com.java8;

@FunctionalInterface
public interface Cab {
	
	
	int i=20;
	public void bookCab(String A,String B);
	
	public static void test()
	{
		System.out.println("Interface Static method");
	}

	default  String test2()
	{
		return "Interface default method";
	}
}
