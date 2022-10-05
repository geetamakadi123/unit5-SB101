package com.question3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {

        ThreadA one =new ThreadA();
        ThreadB two=new ThreadB();

        one.start();
        two.start();

        one.join();
        two.join();

    }

}
