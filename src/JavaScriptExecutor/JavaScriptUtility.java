package JavaScriptExecutor;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JavaScriptUtility {

	public static void refreshWebPage(WebDriver driver)
	{
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");

	}
	
	public static String getTitleOfWebPage(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickOnElement(WebDriver driver,WebElement element)
	{
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", element);
	}
	
	public static void generateAlert(WebDriver driver,String message)
	{
       JavascriptExecutor js=(JavascriptExecutor) driver;
       
       js.executeScript("alert('"+ message +"')");
	}
	
	public static void drawBorder(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void flush(WebDriver driver,WebElement element)
	{
	String bgcolor=	element.getCssValue("backgroundColor");
	
	for(int i=0;i<500;i++)
	{
		changeColour("#330000",element,driver);
		changeColour(bgcolor,element,driver);
	}
	}
	
	public static void changeColour(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroudColor='"+color+ " ' ",element);
		try
		{
			Thread.sleep(200);
		}catch(InterruptedException e)
		{
			
		}
	}
}