package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

	    System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//FireFoxDriver//geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement rightClick=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		
		act.contextClick(rightClick).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		
		String title=driver.switchTo().alert().getText();
		System.out.println(title);
		
		driver.switchTo().alert().accept();
		
		
	}

}
