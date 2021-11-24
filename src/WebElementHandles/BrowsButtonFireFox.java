package WebElementHandles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsButtonFireFox {

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	     
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement brows=driver.findElement(By.xpath("//input[@id='imagesrc']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", brows);
	
    
	Runtime.getRuntime().exec("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//AutoIT_Tools//ExeFile//FileUpload.exe"+ " " +"C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\WebDriver\\AutoIT_Tools\\images\\Taj.jpg");
	
	}

}
