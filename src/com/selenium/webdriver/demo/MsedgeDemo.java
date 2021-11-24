package com.selenium.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class MsedgeDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//Edge//msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
	//	driver.get("https://people.zoho.com/");
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		
        System.out.println("Title:"+title);
        
        System.out.println(driver.getCurrentUrl());
        
 //       String txt= driver.findElement(By.xpath("/html/body/div[2]/div[2]/section/div/div/div[1]/div[1]/div[1]/h1")).getText();
       
   //    System.out.println(txt);
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
        
   //    driver.close(); //close current browser window
       driver.quit(); //close all the browser[All tabs] 
	}

}
