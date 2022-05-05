package com.indiabix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class CRUD {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
		String username="root";
		String password="sarika@98";
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="SELECT * FROM Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				//int id=r.getInt(0);
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result="USER: %d %s %s %s";
				System.out.println(String.format(result, count++,name,password1,email1));
				
			}
			con.close();
			/*String sql=" INSERT INTO Employee22(user_name,password,email)values(?,?,?)";	
			PreparedStatement s=con.prepareStatement(sql);
			
			s.setString(1, "Sarika_marathe");
			s.setString(2, "Pass@123");
			s.setString(3, "sarika@gmail.com");
			int rows=s.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("A new User Information enter successfully");
			}
			con.close();*/
		}
		catch(SQLException e)
		{
			System.out.println("Exception occured"+e);

		}

}}
