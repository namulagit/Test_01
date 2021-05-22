package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers= {2,3,4,5,6,7,8};
		
	List<Integer> a=Arrays.asList(numbers);
	
	List<Integer> arr= Arrays.asList(5,3,6,8,99,33);
	
	//List<Integer> b= a;
	a.addAll(arr);
	
	System.out.println(a);
	
	//System.out.println(a==b);
	
	System.out.println(a);
	System.out.println(a.contains(9));
	
	System.out.println(a);
	System.out.println(Arrays.toString(a.toArray()));
	
	String s = "naveen123Jim";
	
	char[] chars=s.toCharArray();
	
	StringBuilder sb=new StringBuilder();
	String ss="";
	for(char c:chars)
	{
		
		if(Character.isDigit(c))
		{
			sb.append(c);
			
		}
		
	}
	
	
	for(int i=0;i<s.length();i++)
	{
		try {
		int nbr=Integer.parseInt(Character.toString(s.charAt(i)));
		ss+=nbr;
		
		}
		catch(Exception exc)
		{
			
		}
	}
	
	System.out.println(sb);
	System.out.println(ss);
	
	}

}
