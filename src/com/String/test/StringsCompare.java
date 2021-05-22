package com.String.test;

import java.util.Iterator;

public class StringsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="Naveen";
		
		String b="Naveen";
		boolean flag=true;
		if(a.length()==b.length())
		{
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i)!=b.charAt(i))
				{
					flag=false;
				}else
				{
					
				}
				
			}
			if(flag)
			{
				System.out.println("Strings are equall");
			}else
			{
				System.out.println("Strings are not equall");
			}
			
		}
		else
		{
			System.out.println("Strings are not equall");
			
		}
		
				
				
	}

}
