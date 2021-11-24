package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		
		String text=driver.switchTo().alert().getText();
		
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
