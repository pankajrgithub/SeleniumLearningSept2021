package HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		//HtmlUnit headless browser is in-build with selenium it is self developed by selenium using Java
		//headless no GUI displays 
		//add to two jar file in library 
		//1.HtmlUnit-driver latest jar
		//2.HtmlUnit-driver-with dependencies jar
		HtmlUnitDriver driver=new HtmlUnitDriver();
			
		driver.get("https://www.iban.com/country-codes");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
