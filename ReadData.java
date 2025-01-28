package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
	public void readData() {
		final String url = "jdbc:mysql://localhost:3306/employee";
        final String uname = "root";
        final String pass = "admin@123";
        String query = "select * from flightdata";

        Connection con;
        try {
            con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("FlightID");
                String flightname = rs.getString("FlightName");
                String flightsrc = rs.getString("FLightSource");
                String FlightDest = rs.getString("FLightDest");
                String Datetime = rs.getString("FLightTime");

                System.out.println("\t\t FLight ID : "+id+"  FLightName -->> "+flightname+"    FLight Source -->> "+flightsrc+"    FLight Destination -->> "+FlightDest+"    Flight Time --> "+Datetime);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
