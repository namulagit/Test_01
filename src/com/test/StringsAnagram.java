package com.test;

import java.util.Arrays;

public class StringsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="grab";
		
		String s2="brag";
		
		char[] s3=s1.toCharArray();
		
		char[] s4=s1.toCharArray();
		
		Arrays.sort(s3);
		
		Arrays.sort(s4);
		
		if(Arrays.equals(s3, s4))
		{
			System.out.println("Strings are angram");
		}
		else
		{
			System.out.println("Strings are not angram");
			
		}
		
		
	}

}
