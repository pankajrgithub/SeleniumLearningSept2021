package WebElementHandles;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBrowsHandle {

	public static void main(String[] args) throws IOException 
	{
				
     System.setProperty("webdriver.chrome.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ChromeDriver//chromedriver.exe");
		
	 WebDriver driver=new ChromeDriver();
     
     driver.get("https://opensource-demo.orangehrmlive.com/");
     
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
     
     driver.findElement(By.id("btnLogin")).click();
     
     Actions act=new Actions(driver);
     WebElement mov= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
     WebElement emp=driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")); 
     act.moveToElement(mov).moveToElement(emp).click().build().perform();
     
     WebElement brows= driver.findElement(By.id("photofile"));
    
     brows.sendKeys("C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\WebDriver\\AutoIT_Tools\\images\\Taj.jpg");
 
     
     //  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/label[1]")).click();
     
     //to run exe file generated by AutoIT script  
 //    Runtime.getRuntime().exec("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop/WebDriver//AutoIT_Tools//ExeFile//WindowBrowsFile.exe");
     
  //    Runtime.getRuntime().exec("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop/taj.exe");
     
  //   Runtime.getRuntime().exec("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop/tajmehal.exe"+ " " +"C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\Taj.jpg");
     
	}

}
