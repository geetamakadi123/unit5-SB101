package com.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	
	    public static void main(String[] args) {
	       
	        Map<String, Student> student = new HashMap<>();
	        
	        student.put("Gujarat", new Student(12, "Nilesh", 780));
	        student.put("Nagpur", new Student(12, "Ramesh", 750));
	        student.put("Bhopal", new Student(16, "Parag", 680));
	        student.put("Delhi", new Student(14, "Vishakha", 650));

	        Set<Map.Entry<String, Student>> studentInSort = student.entrySet();

	        for (Map.Entry<String, Student> s : studentInSort) {
	            System.out.println(s.getKey() + " :-  " + s.getValue());
	        }

	        List<Entry<String, Student>> list = new ArrayList<Entry<String, Student>>(studentInSort);
	        System.out.println("=========================================");
	        

	        Collections.sort(list, new SortByMarks());
	        for (Entry<String, Student> mapping : list) {
	            System.out.println(mapping.getKey() + "   ==>   " + mapping.getValue());
	        }

	    }
}



