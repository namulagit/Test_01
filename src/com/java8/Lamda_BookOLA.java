package com.java8;

public class Lamda_BookOLA implements Cab {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cab c=(a,b)->System.out.println("Cab booked from "+a+" To "+b);
		
		
		c.bookCab("Hyderabad" , "Banglore");
		
		Cab.test();
		
		c.test2();
		
		
			
			
	
		Cab ola=new Lamda_BookOLA();
		Cab ola1=new Lamda_BookOLA();
		System.out.println(ola.test2());
		
	
		System.out.println(ola.equals(ola1));
	}
	
	
@Override
	public String  test2()
	{
		
		return Cab.super.test2().concat(" Child");
	}
	
	
	
	public void bookCab(String A, String B) {
		// TODO Auto-generated method stub
		
		System.out.println("Cab booked from.. "+A+" To "+B);
		
	}

}
