package SikuliX;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class VerifyFileDownloadFirefox {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		   
		  //create fireFox profile first
		  FirefoxProfile profile=new FirefoxProfile();
		   
		  //set preference for download file
		  
		  profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf"); //and mime type of file
		  profile.setPreference("browser.download.manager.showWhenStarting",false);
		  
		  FirefoxOptions option=new FirefoxOptions();
		  
		  //setProfile() for browser to handle element as per setting
		  option.setProfile(profile);
		  
		  WebDriver driver=new FirefoxDriver(option);
		  
		  driver.get("http://demo.automationtesting.in/FileDownload.html");
		  
		  driver.findElement(By.id("pdfbox")).sendKeys("pdf file downloads");
		   			
		   WebElement generate= driver.findElement(By.id("createPdf"));
		   generate.click();
		  
		   WebElement dowload=driver.findElement(By.id("pdf-link-to-download"));
		   dowload.click();
		  
		  if(isFileExist("C://Users//pankaj.rawat//Downloads/info.txt"))
		  {
			  System.out.println("file exists");
		  }
		  else
		  {
			  System.out.println("file Not exists");
		  }
		  

	}
	public static boolean isFileExist(String path)
	{
		File f=new File(path);
				
		if(f.exists()==true)	
		{
		return true;
		}
		else
		{
			return false;
		}
	}

}
