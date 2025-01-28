package javaDB;

import java.sql.*;

public class ConnectFLightDB {
	public void connect() {
		final String url = "jdbc:mysql://localhost:3306/employee";
		final String uname = "root";
		final String pass ="admin@123";
		
		Connection con=null;
		if(con==null) {
			try {
				con=DriverManager.getConnection(url,uname,pass);
				System.out.print("Connected to Database Successfully");
				System.out.println();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
