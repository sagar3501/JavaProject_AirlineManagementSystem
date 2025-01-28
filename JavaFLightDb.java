package javaDB;
import java.util.*;

public class JavaFLightDb {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueloop = true;
		while(continueloop) {
			System.out.println("Choose from the below operations to perform" );
			System.out.println("1.Check the connection of Database");
			System.out.println("2.Enter Flight Details");
			System.out.println("3.Get Flights Schedule");
			System.out.println("4.Delete Flight data from database");
			System.out.println("5.Exit.");
			int choose=sc.nextInt();
			switch(choose) {
			case 1->{
				ConnectFLightDB connect = new ConnectFLightDB();
				connect.connect();
				System.out.println();
				break;
				}
				case 2->{CreateData cd = new CreateData();
				cd.main();
				break;
				}
				case 3->{ReadData rd = new ReadData();
				rd.readData();
				System.out.println();
				break;}
				case 4->{
					DeleteData dd =new DeleteData();
					dd.Deletedata();
					System.out.println();
					break;
				}
				case 5->{
					System.out.println();
					System.out.println("Exiting the program.....");
					continueloop=false;
					break;
				}
			}
		}
		sc.close();
	}

}
