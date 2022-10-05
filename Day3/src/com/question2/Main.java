package com.question2;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public	class Main {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your date of birth in dd-MM-yyyy format");
	        
	        String dob = sc.next();
	        try {
	            LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	            LocalDate d2 = LocalDate.now();

	            Period p1 = Period.between(d1, d2);
	            System.out.println("Your Current Age is :" + p1);
	            if (d2.getYear() <= d1.getYear())
	                System.out.println("Date should not be in Future");

	        } catch (Exception e) {
	            System.out.println("Please enter the date in correct format");
	        }
	    }
}




