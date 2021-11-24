package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestDemo {

	public static void main(String[] args) throws SQLException {
		//step1 -establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		//step 2- create new statement(query) 
		
		Statement stmt=con.createStatement();
		
		//step3 -execute sql statement by using statement object
		
		String insrt="insert into users values(102,'mercury2','mercury2')";
		stmt.executeQuery(insrt);
		
		//step4 -closed the connection
		
		con.close();
		
		System.out.println("QUERY EXECUTED");

	}

}
