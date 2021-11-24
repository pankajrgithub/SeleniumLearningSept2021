/*Open Browser
 * Open URL "https://opensource-demo.orangehrmlive.com/"
 * Enter User Name
 * Enter Password
 * Click on Login
 * Verify Title 
 */


package com.selenium.webdriver.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GecoDriverSelenium {

	public static void main(String[] args) 
	{
		
     System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
//		System.setProperty("webdriver.firefox.marionett", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//FireFoxDriver//geckodriver.exe");
      
      WebDriver driver=new FirefoxDriver();
      
      driver.get("https://opensource-demo.orangehrmlive.com/");
      
      driver.findElement(By.name("txtUsername")).sendKeys("Admin");
      WebElement web= driver.findElement(By.name("txtPassword"));
      web.sendKeys("admin123");
      driver.findElement(By.name("Submit")).click();
      
      String title="OrangeHRM";
      String actualTitle=driver.getTitle();
      if(title.equals(actualTitle))
      {
      System.out.println("title is correct:"+title);
      }
      else
      {
    	  System.out.println("title is incorrect");
      }
      
      driver.close();
}
}