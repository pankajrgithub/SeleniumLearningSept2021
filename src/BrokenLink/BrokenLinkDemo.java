package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrokenLinkDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.zlti.com");

		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//to get href attribute from anchor tag
		
		for(int i=1; i<links.size();i++)
		{
			WebElement link=links.get(i);
			String url=link.getAttribute("href"); //to get all url from webpage
		//	System.out.println(url); //display all url's in console 
		
		
		    URL linkURL=new URL(url);
		    //create a connection using URL
		    HttpURLConnection Httpconn= (HttpURLConnection)linkURL.openConnection();
		    Httpconn.connect();
		    
		    if(url.isEmpty() ||url==null)
		    {
		    	System.out.println("URL is either not configured for anchor tag or it is empty");
		    	continue;
		    }
		    int response=  Httpconn.getResponseCode();
		    
		    
		    if(response==404)
		    {
		    	System.out.println(url+"-"+"link is broken:");
		    }
		    else
		    {
		    	System.out.println(url+"-"+"link is valid:");
		    }
	}
	}

}
