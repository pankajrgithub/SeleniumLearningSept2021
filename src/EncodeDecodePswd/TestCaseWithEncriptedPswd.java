//Test case with password encode
package EncodeDecodePswd;

import org.apache.commons.net.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseWithEncriptedPswd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//Edge/msedgedriver.exe");
	       
		WebDriver driver=new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys(decodePswd("YWRtaW4xMjM="));
		
		driver.findElement(By.id("btnLogin")).click();
		
	}
		static String decodePswd(String pwd)
		{
			byte[] encode=Base64.decodeBase64(pwd.getBytes());
			return (new String(encode));
		}
	}

