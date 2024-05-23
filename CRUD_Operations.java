import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//Q1 Using API this Step are followed to Creat and Perform Crud Operation on database Using Java....
public class CRUD_Operations {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Id whoes Data you want to Fetch");
		int id=sc.nextInt();
		
		// Click on the Maven Project that you ahve created then click on Build path ---> Configure path
		//Now click on Libraries --->Using Add External Jar File select your API that you have downloaded.
		//Now Click on Apply and then Apply Close the jar file will be Imported in Your Project 
		
		// Following This step You can easily connect your java file with your database Using Mysql Connector-java8.0.28.jar 
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Step 1 Completed.....");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bushra@23");
			System.out.println("Step 2 Completed....");
			
			Statement stmt=con.createStatement();
			System.out.println("Step 3 Completed.......");
			
			// This are Steps That are Used to create The data Base ....
			
			
			 //stmt.execute("insert into credential.Data values('200001',20000,'01-Jan','Master')");
			 //stmt.execute("insert into credential.Data values('200002',21000,'21-Feb','Bacherlor')");
			// stmt.execute("insert into credential.Data values('200004',23000,'09-April','Bachelor')");
			
			//This are Step that are Used to Update the data From database.....
			
			// stmt.executeUpdate("update credential.Data set Employee_Eduction='Master' where Employee_Name=200002");
			
			// Delete Code------>
			
			//stmt.executeUpdate("delete from credential.Data where Employee_Name=200001");
			
			
			
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}

}
