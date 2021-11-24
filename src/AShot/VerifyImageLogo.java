package AShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class VerifyImageLogo {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//
		driver.get("https://en-gb.facebook.com/");
		
		BufferedImage expectedImage =ImageIO.read(new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/OrangeHRMlogo.png"));

		//WebElement img=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		WebElement img=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/img"));
	
		Screenshot screenshot=new AShot().takeScreenshot(driver,img);
		
		BufferedImage actualImage=screenshot.getImage();
		
		ImageDiffer imagediffer=new ImageDiffer();
		ImageDiff diff=imagediffer.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true)
		{
			System.out.println("images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
		
	}

}
