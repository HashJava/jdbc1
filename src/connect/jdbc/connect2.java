package connect.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connect2 {

	public static void main(String[] args) throws SQLException {
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "@@Hash123");

		Statement myStatment = myConnection.createStatement();
		
		//You may bring changes by inserting/deleting/updating or whatever below...
		
		String insertScript = "INSERT INTO `new_table` (`id`, `name`, `grade`, `class`) VALUES ('2', 'Ramesh', '4', 'Book')";
		
		String insertScript2 = "UPDATE INTO `new_table` (`id`, `name`, `grade`, `class`) VALUES ('77', 'Justine', '3', 'Art')";
		
		myStatment.execute(insertScript);
		System.out.println("The listed was successfully added onto SQL datatbase: Thank you");
		
		myStatment.execute(insertScript2);
		System.out.println("The listed was successfully added onto SQL datatbase: Thank you");
		
		
		
	}

}
