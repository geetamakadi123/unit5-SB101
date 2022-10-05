package com.question4;


import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
	    public static void main(String[] args) {
	        Set<Student> students = new TreeSet<>();

	        students.add(new Student(07, "t1", 750));
	        students.add(new Student(45, "t2", 450));
	        students.add(new Student(21, "t3", 650));
	        students.add(new Student(11, "t4", 850));
	        students.add(new Student(23, "t2", 650)); // Duplicate student

	        // from the above Set get another list of students whose marks is
	        // less that 500.

	        System.out.println("All Set of students : ");
	        System.out.println("===================================");
	        students.forEach(s -> System.out.println(s));
	        System.out.println("===================================");
	        Set<Student> filteredList = students.stream().filter(s -> s.getMark() < 500).collect(Collectors.toSet());

	        System.out.println("                                        ");
	        System.out.println("***Student get marks less than 500*****");
	        System.out.println("                                                ");
	        filteredList.forEach(f -> System.out.println(f));
	    }
	



}
