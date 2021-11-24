package RobotsKeyAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpsKeyEvent {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://beta.spicejet.com/");
		
		Robot keybord=new Robot();
		
		keybord.keyPress(KeyEvent.VK_TAB);
	
		keybord.keyPress(KeyEvent.VK_ENTER);
		
	}

}
