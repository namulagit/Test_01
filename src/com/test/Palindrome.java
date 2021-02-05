package com.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int orig=sc.nextInt();
		
		
		int num=orig;
		
		int revNum=0;
		
		while(num!=0)
		{
			revNum=revNum*10+num%10;
			num=num/10;
			
		}

		if(revNum==orig)
		{
			System.out.println("Given number is palindrome "+orig);
			
		}
		else
		{
			System.out.println("Given number is not palindrome "+orig);
		}
		
	}

}
