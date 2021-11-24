package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log4jExample {

	public static void main(String[] args) {
		//here we need to create Logger instance so that we can pass class name
		
		Logger logger=Logger.getLogger("Log4jExample");
		
		DOMConfigurator.configure("Log4.xml");
		
		 System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
			
		   
		 WebDriver driver=new FirefoxDriver();
		 
		 logger.info("browser info");
		 
		 driver.get("http://demo.automationtesting.in/Register.html");
		 
		 logger.info("click on Refresh button");
		 
		 driver.findElement(By.id("Button1")).click();
		
		 logger.info("Entering Fisrt Name:");

		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Automation");;
	}

}
