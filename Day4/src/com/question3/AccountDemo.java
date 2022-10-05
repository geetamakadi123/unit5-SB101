package com.question3;

public class AccountDemo {
	

	    public static void main(String[] args) {

	        Account ac=new Account("123456",100);
	        ac.deposit(100);
	        try {
	            ac.withdraw(500);
	        } catch (InsufficientFundsException e) {
	          
	            System.out.println("error");
	            e.getMessage();
	        }
	        try {
	            ac.withdraw(300);
	        } catch (InsufficientFundsException e) {
	           

	            System.out.println(e.getMessage());

	        }
	    }

	


}
