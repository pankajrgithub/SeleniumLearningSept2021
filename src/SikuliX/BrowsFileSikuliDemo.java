package SikuliX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class BrowsFileSikuliDemo {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		/*
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("history.go(0)");
		
		Thread.sleep(2000);
		*/
		WebElement brows=driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", brows);
		
		String imagesFilePath="C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\WebDriver\\logoImage\\";
		String inputFilePath="C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\";
		
		Screen sc=new Screen();
        
		Pattern fileInputTextBox=new Pattern(imagesFilePath+"search_btn.PNG");
		Pattern openButton=new Pattern(imagesFilePath+"openbtn.PNG");
		
		sc.wait(fileInputTextBox, 20);
		sc.type(fileInputTextBox, inputFilePath+"cheque.jpg");
		sc.click(openButton);
	}

}
