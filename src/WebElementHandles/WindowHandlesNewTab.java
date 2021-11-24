package WebElementHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesNewTab {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		for(String t:s)
		{
	     System.out.println(t); //id's of all opened tabs
		 String title=driver.switchTo().window(t).getTitle(); //get title of all tabs
		 System.out.println(title);
		 
		}
	}

}
