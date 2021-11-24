package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowsOnFireFoxWithScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	     
	    WebDriver driver=new FirefoxDriver();

		/*
		System.setProperty("webdriver.edge.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//Edge/msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); */
		
		 driver.manage().window().maximize();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	     driver.findElement(By.id("btnLogin")).click();
	     driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
	     Thread.sleep(1000);
	     WebElement addEmp= driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
	    
	     addEmp.click();
	     
	     WebElement fileBrows=driver.findElement(By.xpath("//*[@id='photofile']")); 
	     
	    
	     fileBrows.sendKeys("C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\WebDriver\\AutoIT_Tools\\images\\Taj.jpg");
	 
	     //when direct click() method not working use this Javascript code to click() on button
	     /*
         JavascriptExecutor js=(JavascriptExecutor)driver;
         Thread.sleep(500);
	     js.executeScript("arguments[0].click();", fileBrows);
	     
	     */
	}

}
