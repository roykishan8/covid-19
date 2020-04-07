package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datalist {
	String Date[]=new String[27];
	int cases[]=new int[27];
	
	Datalist() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/covid","root","732595@Ki");  

			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("SELECT date_occur, cases from Cases"); 
			
			 
			System.out.println("The list is :  ");
			
			int i=0;
			while(rs.next())  
			{
				Date[i]=rs.getString(1);
				cases[i]=Integer.parseInt(rs.getString(2));
				i++;
				
			}
			
			
			con.close();  
			}catch(Exception e) {
				System.out.println(e);
			}
		//System.out.println(Date[26]);
		

	}
	public String getDate(int a) {
	  return Date[a];
	}
	public int getcases(int a) {
		return cases[a];
	}
	

}
