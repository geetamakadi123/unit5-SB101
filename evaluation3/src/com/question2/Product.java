package com.question2;

public class Product extends Thread {
	
	int product =1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		synchronized(this) {
		for(int i=1; i<=10; i++) {
			product =product*i;
			
		}
		this.notify();
		}
	}
	
	

}
