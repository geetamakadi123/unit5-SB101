
//Q1) Create a Main class inside this create one generic method which will only accept list of its
//equivalent or Parent class, this method will return a generic list. Also print the list.
//Note: Take the input from the user using Scanner
package com.question1;
import java.util.ArrayList;
import java.util.List;
public class Main {
	
	

	@FunctionalInterface
	interface PrintList {
	   abstract void display(List<String> city);
	}

	 public static void main(String[] args) {

	        List<String> list=new ArrayList<>();

	        list.add("Mumbai");
	        list.add("Delhi");
	        list.add("Pune");


	        PrintList p= n->{
	            n.forEach(elem-> System.out.println(elem));
	        };

	        p.display(list);
	    }

}
