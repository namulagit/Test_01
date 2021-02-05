package com.javaInterview;

public class CallByValueImpl {
	 
	 int data=50;  
	  
	 void change(CallByValueImpl op){  
		 op.data=op.data+100;//changes will be in the local variable only  
	 }     
	 public static void main(String args[]){  
		 CallByValueImpl op=new CallByValueImpl();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}


