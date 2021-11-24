package com.selenium.webdriver.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBF {

	public static void main(String[] args) {

    System.setProperty
    ("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//FireFoxDriver//geckodriver.exe");
		
    WebDriver driver=new FirefoxDriver();
 
    //navigation command
    //navigate.get()
    //navigate.to()
    //navigate.back()
    //naviagte.forward()
    driver.get("https://www.zoho.com/people/");
    System.out.println(driver.getTitle());
    
    driver.navigate().to("http://demo.automationtesting.in/Windows.html");
    System.out.println(driver.getTitle());
    
    driver.navigate().back();
    System.out.println(driver.getTitle());
    
    driver.navigate().forward();
    System.out.println(driver.getTitle());
    
    driver.navigate().refresh();
    
    driver.close();
    
	}

}
