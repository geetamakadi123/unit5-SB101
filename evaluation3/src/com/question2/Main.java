package com.question2;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Product p = new Product();
		p.start();
		
		synchronized(p) {
			p.wait();
			
		
			System.out.println("Product of 1 to 10 number:" +p.product);
		}
	}

}
