package FileDownloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownLoadFirefoxDemo {

	public static void main(String[] args) 
	{
	
   System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
   //to create Firefox profile 
   FirefoxProfile profile=new FirefoxProfile();
   
   //set preference for profile
   profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip"); //mime type of file to download
   profile.setPreference("browser.download.manager.showWhenStarting", false);
   
   FirefoxOptions option=new FirefoxOptions();
   option.setProfile(profile);
   
   WebDriver driver=new FirefoxDriver(option);
   
   driver.get("http://testingmasters.com/student-corner/downloads/");
   driver.findElement(By.xpath("//table[@id='tablepress-7']/tbody/tr[3]/td[3]/a")).click();
	}

}
