package com.test;

import java.util.Arrays;

public class WordsAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] countries = {"India","China","Pakistan","South-africa","zimbambe","Uganda"};
		
		for(int i=0;i<countries.length-1;i++)
		{
			
			for(int j=i+1;j<countries.length;j++)
			{
				if(countries[i].compareTo(countries[j])>0)
				{
					
					
					String temp=countries[i];
					countries[i]=countries[j];
					countries[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.println(Arrays.toString(countries));

	}

}
