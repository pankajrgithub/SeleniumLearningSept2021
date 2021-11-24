package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Slider.html");
		
		
		WebElement slide=driver.findElement(By.xpath("//*[@id='slider']/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(slide).dragAndDropBy(slide, 60, 0).build().perform();
	}

}
