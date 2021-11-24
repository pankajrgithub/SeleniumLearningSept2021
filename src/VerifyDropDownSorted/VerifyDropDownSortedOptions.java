package VerifyDropDownSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) 
	{
		
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//open Url to verify drop down having sorted data or Not
		
		driver.get("http://testautomationpractice.blogspot.com/");
	
	    WebElement list=driver.findElement(By.id("animals"));
	    
	    Select se=new Select(list);
	    
	   List original=new ArrayList();
	    
	   List<WebElement>options= se.getOptions();
	   
	   List temp=new ArrayList();
	   for(WebElement we:options)
	   {
		  original.add(we.getText());
		  temp.add(we.getText());
	   }
	   //print original drop down item
	   System.out.println("Original item List"+original);
	   System.out.println("before sorting list item"+temp);
	   
	   Collections.sort(temp);
	   System.out.println("after sorting list item"+temp);
	   
	   if(temp.equals(original))
	   {
		   System.out.println("list item in sorted order......");
	   }
	   else
	   {
		   System.out.println("item not in sorted order..........");
	   }
	}
	
	

}
