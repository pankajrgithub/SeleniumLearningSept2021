package SikuliX;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFileDownloadChrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ChromeDriver//driver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.manage().window().maximize(); //window maxmize 
		
		driver.findElement(By.id("textbox")).sendKeys("text file to download");
		
		driver.findElement(By.id("createTxt")).click();
		
		driver.findElement(By.id("link-to-download")).click();
		
		if(isFileExist("C://Users//pankaj.rawat//Downloads/info.txt"))
		{
			System.out.println("File exist");
		}
		else
		{
			System.out.println("File not Exist");
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
