package connect.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect4 {

	public static void main(String[] args) throws SQLException {

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "@@Hash123");

		Statement stmt = connect.createStatement();
		

		String delecterow = "DELETE FROM java WHERE id = 1";
		String InsertRow = "INSERT INTO `Java` (`id`, `name`, `lastname`) VALUES ('1', 'Indian', 'Mercedez')";
		String InsertRow1 = "INSERT INTO `Java` (`id`, `name`, `lastname`) VALUES ('4', 'SOM', 'Niazi')";
		String InsertRow2 = "INSERT INTO `Java` (`id`, `name`, `lastname`) VALUES ('6', 'Tom', 'Niaz')";
		

		String delecterow1 = "DELETE FROM java WHERE id = 4";
		
		
		stmt.execute(delecterow);
		stmt.execute(InsertRow1); 
		stmt.execute(InsertRow2);
		stmt.execute(delecterow1);

		
		
		System.out.println("Row added");

	}

}
