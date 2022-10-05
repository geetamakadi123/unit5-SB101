package com.question4;

public class CheckOutput {
	
	public static void main(String args[])
	{
	try
	{
	System.out.print("A");
	int num = 99/0;
	System.out.print("B");
	}
	catch(ArithmeticException ex)
	{
	System.out.print("C");
	}
	catch(Exception ex)
	{
	System.out.print("D");
	}
	System.out.print("E");
	}
}
//answer:output of this code is ACE because ArithmeticException  is there in int num=99/0; 
//Not allowed to divided by zero 
//it will give error but before that A is there that why a printed and after catching ArithmeticException  C printed
//after catching exception ex E is also printed.

