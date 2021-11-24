package PageObjectModelOldv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryRegistrationTest {

	public static void main(String[] args) 
	{
		
		
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	    
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    
	    RegistrationPageMercury page=new RegistrationPageMercury(driver);
	    
	    page.registrationLink();
	    
	    page.firstName("Deepesh");
	    
	    page.lastName("Sharma");
	    
	    page.phoneNum("9078654345");
	    
	    page.userEmail("abc@gmail.com");
	    
	    page.userAddress("hyderabad");
	    
	    page.userCity("HYDERABAD");
	    
	    page.userState("TN");
	    
	    page.userCode("76546789");
	    
	    page.userCountry();
	    
	    page.userName("Kamlesh");
	    
	    page.userPass("kamlesh");
	    
	    page.confirmPass("kamlesh");
	    
	    page.submitBtn();

	    //validation 
	    if(driver.getPageSource().contains("Thank you for registering"))
    	{
    		System.out.println("Registration Successful for record");
    	}
    	else
    	{
    		System.out.println("Registration Failed:TEST FAILED record");
    	}
	}

}
