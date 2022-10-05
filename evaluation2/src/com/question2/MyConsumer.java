package com.question2;

import java.util.function.Consumer;

public class MyConsumer {
	
	public static void main(String[] args) {
		
    Consumer<Student> c1=s->{
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
        };
		
		 
		c1.accept(new Student(12, "n1", 300));		
      }
}
