package PageObjectModelOldv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RgistrationTest {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
			
		 WebDriver driver=new FirefoxDriver();
		 
		// RegistraionPage regPage=new RegistraionPage(driver);
		 AddEmployeePOMV_New regPage=new AddEmployeePOMV_New(driver);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 
		 regPage.userName("Admin");
		 regPage.passWord("admin123");
		 regPage.btnClick();
		 Thread.sleep(2000); //ms
		 regPage.pimClick();
		 Thread.sleep(2000);
		 regPage.addEmpClick();
		 regPage.firstName("Adam");
		 regPage.lastName("Gill");
		 regPage.sendImg("C:\\Users\\pankaj.rawat\\OneDrive - Renovite Technologies Inc\\Desktop\\WebDriver\\logoImage\\images_8-1279.jpg");
		 regPage.saveBtn();
		 
		 //validation
		 
		 if(driver.getPageSource().contains("Adam Gill"))
		 {
			 System.out.print("Employee Added Successfuly-TEST PASS");
		 }
		 else
		 {
			 System.out.print("Employee not Added Successfuly-TEST FAILED");
		 }
		 driver.close();
	}

}
