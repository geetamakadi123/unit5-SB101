package com.question2;

import java.util.TreeMap;


public class Main {
	
	    static void Constructor()
	    {
	        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new SortByMarks());

	       
	        tree_map.put(new Student(10, "Bansi", 135),3);
	        tree_map.put(new Student(12, "Aatish", 90),2);
	        tree_map.put(new Student(13, "Godi", 111),1);


	        System.out.print("TreeMap: " + tree_map);
	    }

	    public static void main(String[] args)
	    {

	        System.out.println("Using Treemap " + "TreeMap(Comparator)" + " constructor:\n");
	        Constructor();
	    }
}




