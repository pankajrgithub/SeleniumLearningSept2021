package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrawaLineImageCapture {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.twoplugs.com/");
		
		WebElement border=driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[2]/a"));
		
		
		//draw border on element
		JavaScriptUtility.drawBorder(driver,border);
		Thread.sleep(2000);
		
		//capture screen short for border element
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File trg=new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/plug.png");
		
		FileUtils.copyFile(src, trg);
	}

}
