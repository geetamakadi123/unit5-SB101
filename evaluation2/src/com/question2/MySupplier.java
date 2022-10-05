package com.question2;

import java.util.function.Supplier;

public class MySupplier {
	
public static int getANumber() {
		
		return 900;
	}
	
	public static void main(String[] args) {

        Supplier<Integer> n1 = MySupplier::getANumber;
		
		System.out.println(n1.get());

		Supplier<Student> p1=()->new Student(12,"n1",480);
		System.out.println(p1.get());
		
		Supplier<String> i1 = () -> "This message from the e Lamda expression";
		
		System.out.println(i1.get());
	}
}
