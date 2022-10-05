package com.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class Main {

	
	public static void main(String[] args) {
			
			
			List<String> name = new ArrayList<>();
			
			name.add("Ashu");
			name.add("Ravi");
			name.add("gitu");
			name.add("puna");
			name.add("Ancha");
			
			name.add("Ashwini");
			name.add("Ravina");
			name.add("gitanjali");
			name.add("punam");
			name.add("Anchal");
			
			List<String> name1 = name.stream().filter(s -> (s.length()%2)==0).collect(Collectors.toList());
			
//			System.out.println(name1);
			
			List<String> name2 = name1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
			
//			System.out.println(name2);
			
			name2.forEach(s -> System.out.println(s));
			
			System.out.println("=====================");
			
	        Collections.sort(name2, (s1,s2) -> s2.compareTo(s1));
			
//			System.out.println(name2);
	        
	        name2.forEach(s -> System.out.println(s));
		}
	}
