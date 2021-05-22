package com.ThreadsDemo;

public class ThreadImp extends Thread {
	
	public void run(){
		
		System.out.println("Run invoked -"+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadImp th=new ThreadImp();
		th.start();
	}

}
