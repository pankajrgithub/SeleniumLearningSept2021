package WebElementHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindows {

	public static void main(String[] args) 
	{
	
		//button[contains(text(),'click')]
	
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
	     
	     driver.get("http://demo.automationtesting.in/Windows.html");
	     
	     driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
	     driver.findElement(By.linkText("Open New Seperate Windows")).click();
	     
	     //to get id's of every opened windows tab
	     Set<String> i=driver.getWindowHandles();
	     
	     for(String s:i)
	     {
	    	String t=driver.switchTo().window(s).getTitle();
	    	if(t.contains("Selenium"))
	    	{
	    		driver.close();
	    	}
	    	System.out.println(t);
	    	 
	     }

	}

}
