package StaleElementExceptionReference;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementExceptionRefreshDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.pavantestingtools.com/");
		
		WebElement training=driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
		training.click();
		
		driver.navigate().back();
		try
		{
		training.click();
		}catch(StaleElementReferenceException e)
		{
			training=driver.findElement(By.xpath("//a[contains(text(),'Online Training')]"));
			training.click();
		}
	}

}
