package com.String.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Naveen";

		String b = "Naveen";
		StringBuilder sb=new StringBuilder();
		for (int i =a.length()-1 ; i >=0; i--) {
		sb.append(String.valueOf(a.charAt(i)));
			
		}
	System.out.println(sb);
	}
}
