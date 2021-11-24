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

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		//broken link is a link where we get 404 error on URL
		
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
        driver.get("https://www.jetairways.com/insolvencyproceedings/");
        
        //capture links from a WebPage
        List<WebElement>  link= driver.findElements(By.tagName("a"));
       
        //number of links
        System.out.println(link.size());
        
        for(int i=0;i<link.size();i++)
        //by using href attribute we can get URL of required link
        {
        	WebElement element=link.get(i);
        	String url=element.getAttribute("href");
        	
        	URL links=new URL(url);
        	
        	//create connection using URL object
        	
        	HttpURLConnection httpConn=(HttpURLConnection) links.openConnection();
        	
        	//wait time 2 sec
        	
        	httpConn.connect();
        	
        	int responseCode=httpConn.getResponseCode();
        	
        	if(responseCode>=400)
        	{
        		System.out.println(url+  "-" +"link is broken");
        	}
        	else
        	{
        		System.out.println(url+  "-" +"link is valid");
        	}
        }
	}

}
