package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Courses {
	
	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Course Of Student :");
			String course = sc.next();

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				
				System.out.println("problem with loading the driver related main class");
			}

			String url = "jdbc:mysql://localhost:3306/evaluation4";

			try (Connection conn = DriverManager.getConnection(url, "root", "geeta1997")) {

				PreparedStatement ps = conn.prepareStatement("select * from Course where cname = ?");
				ps.setString(1, course);

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
//				 cid  | cname     | fee   | duration 

					int c = rs.getInt("cid");
					String cn = rs.getString("cname");
					int f = rs.getInt("fee");
					String d = rs.getString("duration");

					System.out.println("Roll is :" + c);
					System.out.println("Name is :" + cn);
					System.out.println("Address is :" + f);
					System.out.println("Mobile is :" + d);

					System.out.println("=============================");

				} else
					System.out.println("(No record found");

			} catch (SQLException e) {

				e.printStackTrace();
				System.out.println(e.getMessage());
			}

		}

	


}
