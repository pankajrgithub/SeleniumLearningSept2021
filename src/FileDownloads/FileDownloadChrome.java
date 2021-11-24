package FileDownloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadChrome {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ChromeDriver//chromedriver.exe");
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("http://demo.automationtesting.in/FileDownload.html");
	   driver.manage().window().fullscreen();
	   
	   //downloaded txt file
	   driver.findElement(By.id("textbox")).sendKeys("downloading txt file in chrome browser");
	   
	   driver.findElement(By.id("createTxt")).click();
	   
	   driver.findElement(By.id("link-to-download")).click();
	   
	   
	   //downloaded pdf file
	   
	   driver.findElement(By.id("pdfbox")).sendKeys("downloading pdf file in chrome browser");
	   
	   driver.findElement(By.id("createPdf")).click();
	   
	   driver.findElement(By.id("pdf-link-to-download")).click();
	   
	   Thread.sleep(1000);
	   driver.close();
	}

}
