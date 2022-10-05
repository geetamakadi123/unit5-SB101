package com.question4;



import java.util.ArrayList;
import java.util.List;




public class Main {
	
	    public static void main(String[] args) {

	        List<String> city = new ArrayList<>();

	       
	        city.add("Amaravti");
	        city.add("Vardha");
	        city.add("Akola");
	        city.add("Nagpur");
	        city.add("Chandrapur");

	        PrintList CityName = cities -> System.out.println("Using Lambda Expression Print the City : " + cities);

	        CityName.display(city);

	    }

}




