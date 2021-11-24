package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PastAndFutreDatePick {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ChromeDriver//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		    WebElement web= driver.findElement(By.name("txtPassword"));
		    web.sendKeys("admin123");
		    driver.findElement(By.name("Submit")).click();
		    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
		  
		    driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		   
		    
		    driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']/b")).click();
		    
		    driver.findElement(By.id("menu_attendance_Attendance")).click();
		    
		    driver.findElement(By.id("menu_attendance_viewMyAttendanceRecord")).click();
		    
		    driver.findElement(By.id("attendance_date")).click();
		     
		   /*
		    WebElement month=driver.findElement(By.xpath("//select[contains(@data-handler,'selectMonth')]"));
		    Select mon=new Select(month);
		    mon.selectByVisibleText("Jul");
		    */
		    
	        WebElement year=driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]"));
		    Select yr=new Select(year);
		    yr.selectByVisibleText("2020");
		    
           //future date selection from date picker through next navigation
		   /*
		    for(int i=2;i>=1;i--)
		    {
		    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		    	
		    	String m= driver.findElement(By.xpath("//select[contains(@data-handler,'selectMonth')]")).getText();
		    	System.out.println(m);
		    	
		    	if(m.contains("Oct"))
		    	{
		    		driver.findElement(By.linkText("3")).click();
		    	    
		    	}
		    } */
		    //Past date month navigation 
		    for(int i=11;i>=1;i--)
		    {
		    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		    	
		    	String m= driver.findElement(By.xpath("//select[contains(@data-handler,'selectMonth')]")).getText();
		    	
		    	if(m.contains("Sep"))
		    	{
		    		driver.findElement(By.linkText("3")).click();
		    	    
		    	}
		    }
	}

}
