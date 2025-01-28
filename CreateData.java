package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreateData {

	public void main() {
		final String url = "jdbc:mysql://localhost:3306/employee";
		final String uname = "root";
		final String pass ="admin@123";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the FlightID number");
		int FlightID = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Flight Name:");
		String FlightName = sc.nextLine();
		System.out.print("Enter the Flight Source: ");
		String FLightSrc = sc.nextLine();
		System.out.print("Enter the FLight Destination: ");
		String FlightDest = sc.nextLine();
		System.out.print("Enter the Flight Date and Time(YYYY-MM-DD HH:MM:SS): ");
		String Datetime = sc.nextLine();
		String query = "INSERT INTO flightdata (FlightID,FlightName,FLightSource,FLightDest,FlightTime) values('"+FlightID+"','"+FlightName+"','"+FLightSrc+"','"+FlightDest+"','"+Datetime+"')";
		Connection con;
		
		try {
			con=DriverManager.getConnection(url,uname,pass);
			Statement stmt = con.createStatement();
			int rows = stmt.executeUpdate(query);
			if(rows==1) {
				System.out.println("\t\t Rows affected.....");
			}
			else {
				System.out.println("\t\t Something is Wrong......!!!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
