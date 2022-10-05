package com.question4;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;




public class Main {

	    public static void main(String[] args) {
	        HashMap<String, List<String>> hm = new HashMap<>();

	        List<String> cities = new ArrayList<>();
	        cities.add("Bhandara");
	        cities.add("Nagpur");
	        cities.add("Chandrapur");
	        cities.add("Nashik");
	        hm.put("Maharshtra", cities);

	        hm.put("Gujarat", Arrays.asList("Ahmedabad", "Surat", "Rajkot", "Junagadh"));
	        hm.put("Uttar Pradesh", Arrays.asList("Agra", "Lucknow", "Kanpur", "Varanasi"));

	        for (Entry<String, List<String>> city : hm.entrySet()) {
	            System.out.println(city.getKey() + " :-  " + city.getValue());
	        }

	        List<Entry<String, List<String>>> list = new ArrayList<Entry<String, List<String>>>(hm.entrySet());

	        System.out.println("========================================================");
	        

	        Collections.sort(list, new StatesBySort());
	        for (Entry<String, List<String>> mapping : list) {
	            System.out.println(mapping.getKey() + "   ==>   " + mapping.getValue());
	        }
	    }
}




