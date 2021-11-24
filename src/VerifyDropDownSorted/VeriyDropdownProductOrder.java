package VerifyDropDownSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VeriyDropdownProductOrder {

	public static void main(String[] args) {
		    System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://testautomationpractice.blogspot.com/");
			
			WebElement element=driver.findElement(By.id("products"));
			Select s=new Select(element);
			List org=new ArrayList();
			List temp=new ArrayList();
			List<WebElement> options=s.getOptions();
			
			for(WebElement we:options)
			{
				org.add(we.getText());
				temp.add(we.getText());
			}
			System.out.println("original drop down item"+org);
			System.out.println("temprary list item:"+temp);
			Collections.sort(temp);
			System.out.println("after sorted list item:"+temp);
			if(temp==org)
			{
				System.out.println("product list is sorted...........");
			}
			else
			{
				System.out.println("dropdown not in sorted order");
			}

	}

}
