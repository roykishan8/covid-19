package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statelist {

	
		String state[]=new String[9];
		String confirmed_case[]=new String[9];
		String active_case[]=new String[9];
		String recovered_case[]=new String[9];
		String death[]=new String[9];

		Statelist() {
			// TODO Auto-generated method stub
			
			try {
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/covid","root","732595@Ki");  

				Statement stmt=con.createStatement(); 
				ResultSet rs1=stmt.executeQuery("SELECT state,confirmed_case,active_case,recovered_case,death from statewise");
				int j=0;
				while(rs1.next()) {
					state[j]=rs1.getString(1);
					confirmed_case[j]=rs1.getString(2);
					active_case[j]=rs1.getString(3);
					recovered_case[j]=rs1.getString(4);
					death[j]=rs1.getString(5);
					j++;
				}
				
				con.close();  
				}catch(Exception e) {
					System.out.println(e);
				}

	}
		public String getState(int a) {
			return state[a];
		}
		public String getconfirmed(int a) {
			return confirmed_case[a];
		}
		public String getactive(int a) {
			return active_case[a];
		}
		public String getrecovered(int a) {
			return recovered_case[a];
		}
		public String getdeath(int a) {
			return death[a];
		}

}
