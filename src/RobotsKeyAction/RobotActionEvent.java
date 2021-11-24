package RobotsKeyAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotActionEvent {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();

		driver.get("https://spreadsheetpage.com/calendar/yearly/");
		
		driver.findElement(By.xpath("//a[contains(@rel,'noindex nofollow')]")).click();
		
		Robot key=new Robot();
		
		Thread.sleep(2000);
		key.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		key.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		key.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		key.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		key.keyPress(KeyEvent.VK_ENTER);
		
		driver.close();
	}

}
