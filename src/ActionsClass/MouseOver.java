package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
        
	/*   System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//SeleniumWebDriver//FireFoxDriver//geckodriver.exe");
        
	   WebDriver driver=new FirefoxDriver();
	    
		*/
		System.setProperty("webdriver.chrome.driver","C://Users//pankaj.rawat//OneDrive -"
				+ " Renovite Technologies Inc//Desktop//SeleniumWebDriver//ChromeDriver//chromedriver.exe");
	   
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	   
	   Actions act=new Actions(driver);
	   
	    WebElement Admin=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
	    WebElement UserMng=driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	    WebElement Users=driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
	    
/*	   act.moveToElement(Admin).build().perform();
	   act.moveToElement(UserMng).build().perform();
	   act.moveToElement(Users).click().build().perform();  */
	    
	   act.moveToElement(Admin).moveToElement(UserMng).moveToElement(Users).click().build().perform();
	   
	   //count rows in user table with enabled status
	   
	   int rowscount=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
	   
	   int count=0;
	   
	   for(int i=1;i<=rowscount;i++)
	   {
		   String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
		   if(status.equals("Enabled"))
		   {
		   count++;
		   }
	   }
	   System.out.println("total number of rows with enabled stattus:"+count);
			   
	   
	   
	}

}
