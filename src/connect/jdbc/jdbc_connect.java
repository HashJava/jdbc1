package connect.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connect {
	// throw exception can help to let you know where the error is?
	public static void main(String[] args) throws SQLException {

		// 3306 is the defualt port or entry address..after putting the address, you put
		// your database name
		Connection tryconnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "@@Hash123");

		// There is an interface where you can use to access the database thru
		// drivermanager class.
		// Make sure you import mysql connect..not others (We will run our quarry)
		Statement stm = tryconnect.createStatement();
		// By creating a variable String we insert -- You may create a table in mysql
		// and copy the script and past it here to execute..
		//Keep in mind you insert delete or do whatever by just add/removing items
		String insertstmt = "INSERT INTO `teachers` (`idnew_table`, `names`, `class`, `subjects`) VALUES ('7', 'Rashed', 'Bio', 'Art');\r\n"
				+ "";
		String deleteScript = "DELETE FROM UNIVERSITY WHERE id = 1"; 
		
		
		String selectScript = "SELECT id, names, subject FROM university"; 
		stm.execute(selectScript);
		ResultSet rs = stm.executeQuery(selectScript); 
		
		
		// Below you will execute by passing the sts variable..just click DOT execute...
		stm.execute(insertstmt);
		//below we will close the connection by variable tryconnect DOT close
		tryconnect.close();
		System.out.println("The script has been added to the list");
	}

}
