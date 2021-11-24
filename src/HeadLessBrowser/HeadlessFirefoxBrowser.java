package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefoxBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FirefoxDriver//geckodriver.exe");
		
        FirefoxOptions option=new FirefoxOptions();
          option.setHeadless(true);
     //   option.addArguments("--headless");
        WebDriver driver=new FirefoxDriver(option);
		
		driver.get("https://www.iban.com/country-codes");
		
		System.out.println(driver.getTitle());
        
	}

}
