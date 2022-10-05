package com.question3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;




public class Main {

	
		public static void main(String[] args) {
			
			
			MyCollableObj m1[] = new MyCollableObj[] {
				
			new MyCollableObj(10),
			new MyCollableObj(20),
			new MyCollableObj(30),
			new MyCollableObj(40),
			new MyCollableObj(41),
			new MyCollableObj(44),
			
				
		}; 
			
			ExecutorService service = Executors.newFixedThreadPool(3);
			
			for(MyCollableObj c:m1) {
			Future<Integer> f= service.submit(c);
			try {
				System.out.println(f.get());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
			service.shutdown();
			
		}
		
		
		
}

