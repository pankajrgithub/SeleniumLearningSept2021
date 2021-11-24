package DataDrivenTest_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleInterestCalculator {

	public static void main(String[] args) throws IOException 
	{
        System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	    
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSBOO1.html");
		
		//to read excel sheet data(Data Driven Test)
		
		//FileInputStream() to read file
		
		FileInputStream file=new FileInputStream("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ExcelFile/FDCalculator.xlsx");
		
		//jump into workbook of excel file
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//read data from sheet of workbook
		
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//get total number of rows present in current sheet
		
		int rows=sheet.getLastRowNum();
		
		for(int i=1;i<rows;i++)
		{
			//focus on first row of sheet
			XSSFRow currentRow=sheet.getRow(i);
			
			//get value of cell after converting into integer 
		    int	principle=(int)currentRow.getCell(0).getNumericCellValue();
		    
		    XSSFCell roi= currentRow.getCell(1);
		    int rate=(int)roi.getNumericCellValue();
		    
		    XSSFCell year=currentRow.getCell(2);
		    int tenure=(int)year.getNumericCellValue();
		    
		    XSSFCell freq=currentRow.getCell(3);
		    String f=freq.getStringCellValue();
		    
		    XSSFCell maturity=currentRow.getCell(4);
		    int expectedValue=(int)maturity.getNumericCellValue();
		    
		    //enter value in FD Calculator using webElement
		    
		    //change integer variable to String by using String.ValueOf(123)
		    //SendKeys() allows only String and Text value
		    
		    driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle));
		    
		    driver.findElement(By.id("interest")).sendKeys(String.valueOf(rate));
		    
		    driver.findElement(By.id("tenure")).sendKeys(String.valueOf(tenure));
		    
		    WebElement tenurePeriod=driver.findElement(By.id("tenurePeriod"));
		    Select s=new Select(tenurePeriod);
		    s.selectByIndex(2);
		    
		    WebElement frequency=driver.findElement(By.id("frequency"));
		    Select select=new Select(frequency);
		    select.selectByVisibleText(f);
		    
		    driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[4]/div/div[1]/div[3]/form/div[2]/a[1]/img")).click();
		    
		    //get actual value in string
		    
		    String actualValue= driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
		    
		    if((Double.parseDouble(actualValue))==expectedValue)
		    {
		    	System.out.println("FD Maturity correct......");
		    }
		    else
		    {
		    	System.out.println("FD maturity calculation incorrect.....");
		    }
		   //clear all drop-down and text boxes
	        driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[4]/div/div[1]/div[3]/form/div[2]/a[2]/img")).click();
		}
		
	}

}
