package com.selenium.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommand {

	public static void main(String[] args) 
	{
    System.setProperty
    ("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//FireFoxDriver//geckodriver.exe");
		      
     WebDriver driver=new FirefoxDriver();
		
//	 driver.get("http://demo.guru99.com/test/newtours/index.php");
     driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
     
     WebElement fname=driver.findElement(By.xpath(".//input[@name='firstname']"));
     
     WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
     if(fname.isDisplayed() && fname.isEnabled())
     {
    	 fname.sendKeys("Pankaj");
     }
     
     if(lname.isDisplayed() && lname.isEnabled())
     {
    	 
    	 lname.sendKeys("Rawat");
     }
	 //isSelected returns boolean value
     
       if(driver.findElement
   		   (By.xpath
    		 ("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).
    		 isSelected()==false) 
    		   
    		   
    	 {
    	   driver.findElement
    	   (By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
    	 } 
     
	     driver.close();
	 
	}

}
