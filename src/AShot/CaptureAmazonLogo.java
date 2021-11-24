package AShot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureAmazonLogo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement img=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"));
		
		
		Screenshot screenshot= new AShot().takeScreenshot(driver,img);
		
		ImageIO.write(screenshot.getImage(), "png", new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/logo.png"));
		
		File f=new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/logo.png");
		
		if(f.exists())
		{
			System.out.println("logo captured");
		}
		else
		{
			System.out.println("not exist");
		}
	}

}
