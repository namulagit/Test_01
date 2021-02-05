package com.test;

public class Fibanaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int A = 1;
		int B = 2; int C = 0;

		for (int i = 1; i < 100; i++) {
			C=A+B;
			System.out.print(A + ",");
			A = B;
			B =C;

		}

	}

}
