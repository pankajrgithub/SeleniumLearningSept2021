package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    WebElement web= driver.findElement(By.name("txtPassword"));
	    web.sendKeys("admin123");
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']/b")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("menu_attendance_Attendance")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("menu_attendance_viewMyAttendanceRecord")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("attendance_date")).click();
	     
	    Thread.sleep(500);
	    WebElement month=driver.findElement(By.xpath("//select[contains(@data-handler,'selectMonth')]"));;
	    Select mon=new Select(month);
	    mon.selectByVisibleText("Jul");
	    
	    Thread.sleep(500);
        WebElement year=driver.findElement(By.xpath("//select[contains(@data-handler,'selectYear')]"));
	    
	    Select yr=new Select(year);
	    yr.selectByVisibleText("2020");
	    Thread.sleep(500);
	    WebElement day= driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[7]/a"));
	    day.click();
	}

}
