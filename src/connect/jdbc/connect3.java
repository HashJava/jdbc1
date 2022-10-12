package connect.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect3 {

	public static void main(String[] args) throws SQLException {

		//The below Myconnection variable is connected to the database..with DriManger class
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "@@Hash123");
		//Write a statement
		Statement myStatment = myConnection.createStatement();
		
		String deleteScript = "DELETE FROM accounting WHERE id = 1";		
		String InsertScript = "INSERT INTO `accounting` (`id`, `name`, `accountname`) VALUES ('1', 'Hash', 'Bank')";
	
		String getdata = "Select id, name, accountname FROM accounting";
		
		ResultSet RESULT = myStatment.executeQuery(getdata); 
		
		while (RESULT.next()) {
			
			int id = RESULT.getInt("id");
			String name = RESULT.getString("name");
			String accountname = RESULT.getString("accountname"); 
		}
		myStatment.execute(getdata);
		myStatment.execute(deleteScript); 
		myStatment.execute(InsertScript);		
		System.out.println("Quary deleted");
}}
