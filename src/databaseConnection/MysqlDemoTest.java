package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDemoTest {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","pankaj");
		
		//step 2- create new statement(query) 
		
		Statement stmt=con.createStatement();
		
		//step3 -execute sql statement by using statement object
		
		
		String s="select userName,pswd from users";		
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next())
		{
			System.out.print(rs.getString("userName")+" ");
			System.out.println(rs.getString("pswd"));
		}
		//step4 -closed the connection
		
		con.close();
		
		System.out.println("QUERY EXECUTED");

	}

}
