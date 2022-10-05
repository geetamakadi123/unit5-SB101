package com.question2;

import java.util.ArrayList;
import java.util.List;



public class Demo {
	
	

	    public static void main(String[] args) {

	        List<City> citylist = new ArrayList<City>();
	        citylist.add(new City( "Nagpur"));
	        citylist.add(new City( "Chandrapur"));
	        citylist.add(new City( "Bhandara"));
	        citylist.add(new City( "Nashik"));
	        citylist.add(new City( "Mumbai"));

	        citylist.sort((City s1, City s2) -> s2.getCity().compareTo(s1.getCity()));
	        citylist.forEach((s) -> System.out.println(s));
	    }


}
