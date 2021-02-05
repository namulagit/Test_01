package com.test;

public class Test_02 extends Test_01 {
	
	
	
	public static  void show()
	{
		
		System.out.println("Static method extended");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_01 t1=new Test_01();
		
		Test_02 t2=new Test_02();
		t1.i=40;
		t1.j=100;
		t1.test();
		t2.show();
		Test_01.show();
		Test_02.show();
		Test_03 t3=new Test_03();
		t3.show();
		
		
	}

}
