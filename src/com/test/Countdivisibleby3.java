package com.test;

import java.util.Scanner;

public class Countdivisibleby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int OriginalNUm=sc.nextInt();
		int count_X=0;
		int count_Y=0;
		int count_Z=0;
		
		for( int i=1;i<=OriginalNUm;i++)
		{
			
			if(i%3==0)
			{
				
				count_X++;
			}
			if(i%5==0)
			{
				
				count_Y++;
			}
			
			if(i%7==0)
			{
				
				count_Z++;
			}
		}
		System.out.println(""+count_X+"-"+count_Y+"-"+count_Z);		

	}

}
