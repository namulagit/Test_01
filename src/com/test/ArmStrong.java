package com.test;

public class ArmStrong {
	
	
	public static boolean testArmStrong(int i) {
		
		boolean flag=false;
		
		int number=i;
		int Copynumber=number;
		
		int armNum=0;
		
		while(Copynumber>0)
		{
			
			armNum=armNum+(Copynumber%10)*(Copynumber%10)*(Copynumber%10);
			Copynumber=Copynumber/10;
		}
		
		if(armNum==number)
			
		{
			System.out.println(number+"is Arm Strong");
			
		}else
		{
			System.out.println(number+"is not Arm Strong");
		}
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testArmStrong(143);

	}

}
