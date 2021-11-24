package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {

		 System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://jqueryui.com/slider/");
		
	//	URL:http://demo.automationtesting.in/Slider.html
		 
		 //to switch on frame and iframe
		 driver.switchTo().frame(0);
		 WebElement slide=driver.findElement(By.xpath("//div[@id='slider']/span"));
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(slide).dragAndDropBy(slide, 250,0).build().perform();
		 
		 
	}

}
