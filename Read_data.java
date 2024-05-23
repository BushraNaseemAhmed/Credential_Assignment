package crud_operation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Read_data
{
		public static void main(String[] args) 
		{
		        // JDBC URL, username and password of MySQL server
		        String url = "jdbc:mysql://localhost:3306?user=root&password=bushra@23";
		        

		        // JDBC variables for opening and managing connection
		        Connection con = null;
		        PreparedStatement pst = null;
		        ResultSet rs = null;

		        try {
		            // Load the MySQL JDBC driver
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Establishing a connection to the database
		            con = DriverManager.getConnection(url);

		            // Creating a PreparedStatement to execute a SQL query
		            String query = "select * from credential.Data";
		            pst = con.prepareStatement(query);

		            // Executing the query
		            rs = pst.executeQuery();

		            // Processing the ResultSet
		            while (rs.next()) {
		                // Assuming the table has columns 'id' and 'name'
		                int Employee_Name = rs.getInt(1);
		               int  Employee_Salary = rs.getInt(2);
		               String Employee_Hiring=rs.getString(3);
		               String Employee_Eduction=rs.getString(4);

		                // Printing the result
		                System.out.println("ID: " + Employee_Name + ", Name: " + Employee_Salary+" "+Employee_Hiring+" "+Employee_Eduction);
		            }

		        } catch (ClassNotFoundException | SQLException ex) {
		            ex.printStackTrace();
		        } finally {
		            // Closing the resources
		            try {
		                if (rs != null) rs.close();
		                if (pst != null) pst.close();
		                if (con != null) con.close();
		            } catch (SQLException ex) {
		                ex.printStackTrace();
		            }
		        }
	}

}
