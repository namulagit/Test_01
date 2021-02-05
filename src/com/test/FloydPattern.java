package com.test;

import java.util.Scanner;

public class FloydPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=1;
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
				
			}
			
			System.out.print(" ");
		}

	}

}
