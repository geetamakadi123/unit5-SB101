package com.question6;

import java.util.concurrent.*;

public class MyCallable implements Callable<String> {
	    int num;

	    public MyCallable(int num) {
	        this.num = num;
	    }

	    @Override
	    public String call() throws Exception {
	        System.out.println(Thread.currentThread().getName() + " .. is responsible to find the Even/Odd of numbers");

	        for (int i = 0; i <= num; i++) {
	            if (num % 2 == 0) {
	                return (num + " Even Number");
	            } else {
	                return (num + " Odd Number");
	            }
	        }
	        return null;

	    
	}

}
