package questions1;

import java.util.Scanner;


public class Main {
	

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);

	        int n = sc.nextInt();
	        

	        try {
	        	
	            int number=n;
	            System.out.println("Enter number: " +number);
	            System.out.println("The square of Integer:" +number*number);
	            

	        }catch (NumberFormatException e) {
	        	
	            System.out.println("Entered input is not a valid format for an integer.");
	        }
	        
	        System.out.println("The work has been done successfully");
	    }

}



