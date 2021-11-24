package ScrollingWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
      WebDriver driver=new FirefoxDriver();


      driver.get("https://www.iban.com/country-codes");
      
      JavascriptExecutor js= (JavascriptExecutor)driver;
      
      //scrolling by pixel
    //  js.executeScript("window.scrollBy(0,1000)");
      
      //scrolling page till we find Element
      
      WebElement ind=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/table/tbody/tr[103]/td[1]"));
      
      js.executeScript("arguments[0].scrollIntoView(true)", ind);
      
      
      //scrolling till bottom
      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
	}

}
