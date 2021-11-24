package StaleElementExceptionReference;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementExceptionRefreshDemo {

	     public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
			
		 WebDriver driver=new FirefoxDriver();

		 driver.get("https://www.freecrm.com/index.html");
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		 
		 Thread.sleep(5000);
		 
		 WebElement name=driver.findElement(By.name("email"));
		 name.sendKeys("pankaj");
		 WebElement pswd=driver.findElement(By.name("password")); 
		 pswd.sendKeys("abcd");
		 
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 try
		 {
		 name.sendKeys("pankaj.qa@yahoo.com");
		 pswd.sendKeys("abcd");
		 }
		 catch(StaleElementReferenceException e)
		 {
			 name=driver.findElement(By.name("email"));
			 name.sendKeys("pankaj");
			 pswd=driver.findElement(By.name("password")); 
			 pswd.sendKeys("abcd");
		 }
		 
	}

}
