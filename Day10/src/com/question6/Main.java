package com.question6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {


	 public static void main(String[] args) throws Exception {
	        MyCallable[] jobs = {
	                              new MyCallable(1),
	                              new MyCallable(2),
	                              new MyCallable(3),
	                              new MyCallable(4),
	                              new MyCallable(5),
	                              new MyCallable(6)
	                                                      };


	        ExecutorService service = Executors.newFixedThreadPool(3);

	        for (MyCallable job : jobs) {
	        	
	        }
	            Future<String> f = service.submit(job);
	            System.out.println(f.get());
	        }

	        service.shutdown();
 }
