package com.question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {

	        Scanner sc= new Scanner(System.in);

	        Queue <Product> p1 =new PriorityQueue<Product>(new ProductComp()) ;


	        p1.add(new Product(1,"n1",10));
	        p1.add(new Product(2,"n2",11));
	        p1.add(new Product(3,"n3",12));
	        p1.add(new Product(4,"n4",13));


	        Iterator<Product> itr= p1.iterator();

	        while(itr.hasNext()) {

	            Product p2;
	            
	            if(( p2=p1.poll())!=null) {
	            	
	                System.out.println(p2);
	                
	            };

	        }
	    }

}




