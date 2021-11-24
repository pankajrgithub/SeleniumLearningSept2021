package AuthPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUps {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
        
		//https://username:password@test.com
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		driver.close();
	}

}
