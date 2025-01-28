package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
	public void Deletedata() {
		final String url = "jdbc:mysql://localhost:3306/employee";
        final String uname = "root";
        final String pass = "admin@123";
        Scanner sc = new Scanner(System.in);
        ReadData rd = new ReadData();
        rd.readData();
        System.out.println();
        System.out.println("Enter the Flight ID to perform deletion: ");
        int Id =sc.nextInt();
        String query = "DELETE FROM flightdata where FlightID ='"+Id+"' ";
        Connection con;
        try {
        	con = DriverManager.getConnection(url,uname,pass);
        	Statement st = con.createStatement();
        	int rs = st.executeUpdate(query);
        	if(rs==1) {
        		System.out.println("\t\t\t Rows Effected......");
        	}
        	else {
        		System.out.println("Please Enter Correct ID...!");
        		Deletedata();
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
