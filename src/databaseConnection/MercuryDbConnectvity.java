package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryDbConnectvity {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");

		//step 1 establish the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","pankaj");
		
		//step2 create statement or query to be executed
		
		Statement stmnt=conn.createStatement();
		
		//step3 -execute query
		String s="select userName,pswd from users";
		
		ResultSet rs=stmnt.executeQuery(s); //additional in case of select query statement
		
		while(rs.next())
		{
			String user=rs.getString("userName");
			String pswd=rs.getString("pswd");
			
			driver.findElement(By.name("userName")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(pswd);
			
			driver.findElement(By.name("submit")).click();
		}
		
		//step4: close the connection
		conn.close();
		
		System.out.println("connection close");
	}

}
