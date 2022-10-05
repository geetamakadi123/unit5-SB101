package com.question1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	    // Main driver method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Name of Employee : ");
	        String name = sc.nextLine()+"\n";
	        System.out.println("Enter the Address of Employee : ");
	        String address = sc.nextLine();
	        String text = name;
	        String text1 = address;

	        try {
	            BufferedWriter f_writer = new BufferedWriter(new FileWriter("abc.txt"));

	            f_writer.write(text);
	            f_writer.write(text1);

	            System.out.println("Emploee: "+text);
	            System.out.println("Address : "+text1);

	            System.out.print("File is created successfully with the content.");

	            f_writer.close();

	        } catch (IOException e) {
	            System.out.print(e.getMessage());
	        }
	    
	}


}
