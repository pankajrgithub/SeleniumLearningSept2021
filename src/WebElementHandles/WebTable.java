package WebElementHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/pankaj.rawat/OneDrive%20-%20Renovite%20Technologies%20Inc/Desktop/Api's%20Postman/HTML_Practice/table.htm");
		
		int rows=driver.findElements(By.xpath("/html/body/table[1]/tbody/tr")).size();
		
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("/html/body/table[1]/tbody[1]/tr/th")).size();
		
		System.out.println(cols);
		
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
			}
			System.out.println(" ");
		}
	}

}
