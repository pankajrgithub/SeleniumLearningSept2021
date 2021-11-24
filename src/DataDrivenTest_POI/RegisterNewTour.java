package DataDrivenTest_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewTour {

	public static void main(String[] args) throws IOException {
		
			
		System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	    
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    
	    FileInputStream file=new FileInputStream("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ExcelFile/regis.xlsx");
	
	    XSSFWorkbook book=new XSSFWorkbook(file);
	    
	    XSSFSheet sheet=book.getSheet("Sheet1");
	    
	    int rows=sheet.getLastRowNum(); //get last row number
	    
	    System.out.println("Total number of rows:"+rows);
	    
	    for(int i=1;i<rows;i++)
	    {
	    	XSSFRow currentRow=sheet.getRow(i);
	    	
	    	String first_name=currentRow.getCell(0).toString();
	    	String last_name=currentRow.getCell(1).toString();
	    	String phone_num=currentRow.getCell(2).toString();
	    	String email=currentRow.getCell(3).toString();
	    	String addrs=currentRow.getCell(4).toString();
	    	String city=currentRow.getCell(5).toString();
	    	String state=currentRow.getCell(6).toString();
	    	String code=currentRow.getCell(7).toString();
	    	String country=currentRow.getCell(8).toString();
	    	String user=currentRow.getCell(9).toString();
	    	String pass=currentRow.getCell(10).toString();
	    	String confirm_pass=currentRow.getCell(11).toString();
	    	
	    	//Registration Link
	    	
	    	driver.findElement(By.linkText("REGISTER")).click();
	    	
	    	//Contact Info
	    	
	    	driver.findElement(By.name("firstName")).sendKeys(first_name);
	    	driver.findElement(By.name("lastName")).sendKeys(last_name);
	    	driver.findElement(By.name("phone")).sendKeys(phone_num);
	    	driver.findElement(By.name("userName")).sendKeys(email);
	    	
	    	//mailing address
	    	
	    	driver.findElement(By.name("address1")).sendKeys(addrs);
	    	driver.findElement(By.name("city")).sendKeys(city);
	    	driver.findElement(By.name("state")).sendKeys(state);
	    	driver.findElement(By.name("postalCode")).sendKeys(code);
	    	
	    	WebElement countryName=driver.findElement(By.name("country"));
	    	Select select=new Select(countryName);
	    	select.selectByVisibleText(country);
	    	
	    	
	    	//user information
	    	
	    	driver.findElement(By.id("email")).sendKeys(user);
	    	driver.findElement(By.name("password")).sendKeys(pass);
	    	driver.findElement(By.name("confirmPassword")).sendKeys(confirm_pass);
	    	
	    	//submit form
	    	
	    	driver.findElement(By.name("submit")).click();
	    	
	    	if(driver.getPageSource().contains("Thank you for registering"))
	    	{
	    		System.out.println("Registration Successful for:"+i +"record");
	    	}
	    	else
	    	{
	    		System.out.println("Registration Failed:TEST FAILED"+i +"record");
	    	}
	    	
	    }
	    driver.close();
	}

}
