package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.twoplugs.com/");
		
		//refresh WebPage using JavaScript
	//	Thread.sleep(3000); //wait for 3 second to see page refreshment 
		
	//	JavaScriptUtility.refreshWebPage(driver);
		
		
		//to get title of the webPage using script
		
		String getTitle=JavaScriptUtility.getTitleOfWebPage(driver);
		
		System.out.println(getTitle);
		
		//click on login button using JavaScript
		
	//	WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/header/div[1]/ul[1]/li[1]/a"));
		
	/*	JavaScriptUtility.clickOnElement(driver, loginBtn);
		
		//generating alert using script
		Thread.sleep(4000);
		JavaScriptUtility.generateAlert(driver, "YOU CLICKED ON LOGIN BUTTON.....");
	*/
		//draw border on WebElement
		
		WebElement border=driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[2]/a"));
	//	JavaScriptUtility.drawBorder(driver, border);
		
		//get flash on element
		
		JavaScriptUtility.flush(driver, border);
	}

}
