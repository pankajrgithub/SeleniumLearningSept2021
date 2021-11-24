package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTB {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/pankaj.rawat/OneDrive%20-%20Renovite%20Technologies%20Inc/Desktop/Api's%20Postman/HTML_Practice/table.htm");
		
		int rows=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/th")).size();
		
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td")).size();
		
		System.out.println(cols);
		
		//exception on this code where row span used for webTable
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(driver.findElement(By.xpath("/html/body/table[3]/tbody/tr["+ i +"]/td["+ j +"]")).getText());
			}
			System.out.println(" ");
		}

	}

}
