package com.question3;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;




public class Main {
	

	    public static void main(String[] args) {


	        List<Student> list = new ArrayList<>();

	        list.add(new Student(10,"Aatish",750,"Vardha"));
	        list.add(new Student(12,"Bansi",780,"Nagpur"));
	        list.add(new Student(13,"vimal",850,"Bhiwapur"));
	        list.add(new Student(15,"Aachal",720,"Pauni"));
	        list.add(new Student(14,"Minal",880,"Shelu"));


	       List<Employee> l1= list.stream()
	    		   .filter(student -> student.getMarks()>500)
	                .map(student -> new Employee(student.getRoll(), student.getName(), student.getMarks()*1000,student.getaddress()))
	                .collect(Collectors.toList());

	       l1.forEach(i-> System.out.println(i));
	       
	    }
	

}
