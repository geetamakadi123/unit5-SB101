package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	
		public static void main(String[] args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
			String url = "jdbc:mysql://localhost:3306/geetadb";
			
			try {
			 Connection conn=  DriverManager.getConnection(url, "root", "geeta1997"); // here "root" put the own sql password and run the file..
			 
			 if(conn != null)
				 System.out.println("connected....");
			 
			 
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
		}

	


}
