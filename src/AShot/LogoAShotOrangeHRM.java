/* to create a snap shot in selenium WebDriver we need third party API's 
AShot,Gson ,Hamcreast jar required to automate snapshot

*/
package AShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LogoAShotOrangeHRM {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement img=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		
		Screenshot logoScrnShot=new AShot().takeScreenshot(driver,img);
		
		ImageIO.write(logoScrnShot.getImage(), "png", new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/OrangeHRMlogo.png"));
		
		File f=new File("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//logoImage/OrangeHRMlogo.png");
		
		if(f.exists())
		{
			System.out.println("Logo Captured");
		}
		else
		{
			System.out.println("logo not exist");
		}
	}

}
