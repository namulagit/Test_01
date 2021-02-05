package com.javaInterview;

public class Reclangle {
	
	int lenngth=10;
	
	int x=20;
	
	public void modify(int y)
	{
		y=20;
		
	}
	
	public void modify(Reclangle r2)
	{
		r2.lenngth=40;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reclangle rect=new Reclangle();
		
		//call by reference
		rect.lenngth=30;
		System.out.println(rect.lenngth);
		
		rect.modify(rect);
		System.out.println(rect.lenngth);
		
		//call by value
		int z=30;
		rect.modify(z);
		System.out.println(z);

	}

}
