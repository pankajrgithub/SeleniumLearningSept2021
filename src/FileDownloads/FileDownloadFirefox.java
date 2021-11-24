package FileDownloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadFirefox {

	public static void main(String[] args) 
	{

	       System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		  
		   //1. to ignore download window Pop-up while clicking on download button on firefox browser to create FirefoxProfile first
		   
		   FirefoxProfile profile=new FirefoxProfile();
		   
		   //2.set properties to not show file download configuration dialogue using
		   
		   //https://www.sitepoint.com/mime-types-complete-list/
		   
		   profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");//set mime type of file to download
		   profile.setPreference("browser.download.manager.showWhenStarting",false);
		   
		   //3. to set profile
		   FirefoxOptions option=new FirefoxOptions();
		   
		   option.setProfile(profile);
		   
           WebDriver driver=new FirefoxDriver(option);
		   
		   driver.get("http://demo.automationtesting.in/FileDownload.html");
		   
		   driver.findElement(By.id("textbox")).sendKeys("Hello welcome to firefox file downloading");
		   
		   //xpath for label and text ----//button[contains(text(),'Generate File')]
		   
		   WebElement generate= driver.findElement(By.id("createTxt"));
		   generate.click();
		   
		   
		   WebElement dowload=driver.findElement(By.id("link-to-download"));
		   dowload.click();
	}

}
