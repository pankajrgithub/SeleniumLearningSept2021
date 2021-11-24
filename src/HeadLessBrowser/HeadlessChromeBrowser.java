package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ChromeDriver//driver/chromedriver.exe");
		
		//create object of ChromeOption 
		//setHeadless true to run browser in back ground
		//GUI can't be see in case of headless but performance is faster than normal browser
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless");
		option.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.iban.com/country-codes");
		
		System.out.println(driver.getTitle());

	}

}
