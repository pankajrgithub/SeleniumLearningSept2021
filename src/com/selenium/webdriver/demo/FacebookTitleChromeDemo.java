package com.selenium.webdriver.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleChromeDemo {

	public static void main(String[] args) 
	{
     
		System.setProperty("webdriver.chrome.driver","C://Users//pankaj.rawat//OneDrive -"
				+ " Renovite Technologies Inc//Desktop//SeleniumWebDriver//ChromeDriver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
		String expectedTitle="Facebook - लॉग इन या साइन अप करें";
		String title=driver.getTitle();
		if(title.equals(expectedTitle)==true)	
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
