package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Rollno {
	


		public static void main(String[] args) {
		
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter roll Number Of Student :");
			
			int roll= sc.nextInt();
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("problem with loading the driver related main class");
			}
			
			
			String url = "jdbc:mysql://localhost:3306/evaluation4";
			
			
			
			try(Connection  conn=  DriverManager.getConnection(url, "root", "geeta1997")) {

				
				
			
			PreparedStatement ps= conn.prepareStatement("select * from Student where roll = ?");
			
			ps.setInt(1, roll);
			 	
			ResultSet rs = ps.executeQuery();	
			 
			if(rs.next()) {
				
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a= rs.getString("address");
				String m= rs.getString("mobile");
				
				
				System.out.println("Roll is :"+r);
				System.out.println("Name is :"+n);
				System.out.println("Address is :"+a);
				System.out.println("Mobile is :"+m);
				
				System.out.println("=============================");
				
			}else
				System.out.println("(No record found");
			 
			}catch(SQLException e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			
		

	}


}
