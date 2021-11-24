package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		/*
		driver.switchTo().alert().accept();;
		
		String Expected="You pressed Ok";
		
		String ActualText=driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]")).getText();
		
		if(Expected.equals(ActualText)==true)
		{
			System.out.println("test is pass");
		}
		*/
		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		String ActualCancelText=driver.findElement(By.xpath("//p[contains(text(),'You Pressed Cancel')]")).getText();
		
		if(ExpTextCancel.equals(ActualCancelText)==true)
		{
			System.out.println("test pass with cancel");
		}
	}

}
