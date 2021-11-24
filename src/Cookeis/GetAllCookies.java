package Cookeis;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllCookies {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies=driver.manage().getCookies(); //capture all the cookies from browser
		
		System.out.println("Number of Cookies:"+cookies.size()); //total number of cookeis
	/*	
		for(Cookie cookie:cookies)	
		{
			System.out.println(cookie.getName()+"-" +cookie.getValue());
		}
		
		//get specific cookei name and details
		
		System.out.println(driver.manage().getCookieNamed("i18n")); */
		
		//Add new cookie into browser
		
		Cookie addNew=new Cookie("cockie_strore","sessionExpriry");
		driver.manage().addCookie(addNew);
		
		cookies=driver.manage().getCookies();
		
		System.out.println("size after Added:"+cookies.size());
		
		for(Cookie cookie:cookies)	
		{
			System.out.println(cookie.getName()+"-" +cookie.getValue());
		}
		
		//delete a cookie
		
		driver.manage().deleteCookie(addNew);
		
		cookies=driver.manage().getCookies();
				
				System.out.println("after delete:"+cookies.size());
				
				//print cookies after deletion  
				
				for(Cookie cookie:cookies)	
				{
					System.out.println(cookie.getName()+"-" +cookie.getValue());
				}
				
				//delete all cookies from browser
				
				driver.manage().deleteAllCookies();
				cookies=driver.manage().getCookies();
				
				System.out.println("after deleting all:"+cookies.size());
				driver.close();
	}

}
