package com.question3;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class CapitalState {
	

	        public static void main(String[] args) {
	        	
	            Map<String,String> liskedhashMap=new LinkedHashMap<String,String>();

	            liskedhashMap.put("Delhi", "New Delhi");
	            liskedhashMap.put("Andhr Pradesh", "Hyderabad");
	            liskedhashMap.put("Arunachal", "Itanagar");
	            liskedhashMap.put("Assam", "Dispur");
	            liskedhashMap.put("Maharashtra", "Mumbai");

	            Set<Map.Entry<String,String>> lhs=liskedhashMap.entrySet();
	            
	            for(Map.Entry<String, String> city:lhs) {
	            	
	                System.out.println(city.getKey()+" "+city.getValue());
	            }
	        }

}




