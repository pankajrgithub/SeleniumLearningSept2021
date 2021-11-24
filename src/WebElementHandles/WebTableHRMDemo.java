//Test Case -To get total number of user in table with enabled status?

package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHRMDemo {

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
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	  
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
	   
	    Thread.sleep(500);
	    
	    WebElement user=driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
	    user.click();
	    
	    int r=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
	    System.out.println(r);
	    int c=driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th")).size();
	    System.out.println(c);
	    
	    int statusCount=0;
	    for(int i=1;i<=r;i++)
	    {
	    	
	    	String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[5]")).getText();
	    	
	    	if(status.contains("Enabled"))
	    	{
	    		statusCount=statusCount+1;
	    	
	    }
	    }
	    System.out.println("total number of user with enabled status:"+statusCount);
	    
	}

}
