package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithTextBox {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 
		 driver.findElement(By.linkText("Alert with Textbox")).click();
		 driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
		 
		 driver.switchTo().alert().sendKeys("pankaj");
		 driver.switchTo().alert().accept();
		 String ActualText=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		 
		 if(ActualText.contains("pankaj"))
		 {
			 System.out.println("test Pass");
		 }
	}

}
