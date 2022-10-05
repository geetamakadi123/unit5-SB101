package com.question2;
import java.util.function.Predicate;
public class MyPredicate {

	public static void main(String[] args) {
		
		Predicate<Student> pp1=s-> s.getMarks()<500;
		System.out.println(pp1.test(new Student(10,"n1",450)));

	}
}
