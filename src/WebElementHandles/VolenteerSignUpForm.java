package WebElementHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VolenteerSignUpForm {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Pankaj");
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Rawat");
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Registration form");
		
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("pankajr.qa@yahoo.com");
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("9809789876");
	    
	    WebElement gender=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]"));
	    
	   if(gender.isSelected()==false)
	   {
		  gender.click();
	   }
	   
	  boolean hobbie= driver.findElement(By.id("checkbox2")).isSelected();
	  
	  if(hobbie==false)
	  {
		  driver.findElement(By.id("checkbox2")).click();
	  }
	 
	  driver.findElement(By.xpath("//div[@id='msdd']")).click();
	  
	  driver.findElement(By.linkText("Czech")).click();
	  driver.findElement(By.linkText("Hindi")).click();
	
	  driver.findElement(By.xpath("//label[contains(text(),'Skills')]")).click();
	  WebElement skill=driver.findElement(By.xpath("//*[@id='Skills']"));
	  Select sel=new Select(skill);
	  
	  sel.selectByVisibleText("Android"); //select by visible text
	//  sel.selectByIndex(1); //select by index
	//  sel.selectByValue("APIs");
	   
	  //to get total number for item present in the drop-down.
	   
	  
	  System.out.println("Item present in drop down:"+sel.getOptions().size());
	  
	  WebElement year=driver.findElement(By.id("yearbox"));
	  
	  Select sec=new Select(year);
	  sec.selectByVisibleText("2015");
	  
	  //xpath using contains() method 
	  WebElement month=driver.findElement(By.xpath("//select[contains(@placeholder,'Month')]"));
	  Select sec1=new Select(month);
	  sec1.selectByVisibleText("May");
	  
	  
	  //css selector Tag & attribute
	  WebElement days=driver.findElement(By.cssSelector("select[placeholder='Day']"));
	  Select sec2=new Select(days);
	  sec2.selectByVisibleText("3");
	}

}
