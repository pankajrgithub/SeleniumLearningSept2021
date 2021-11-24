package DataDrivenTest_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcelDataUsingPOI {

	public static void main(String[] args) throws IOException 
	{
		
      System.setProperty("webdriver.gecko.driver", "C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
    
      
      FileInputStream file=new FileInputStream("C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//ExcelFile/EmpData.xlsx");
	
      XSSFWorkbook book=new XSSFWorkbook(file);
      
      XSSFSheet sheet=book.getSheet("Sheet1"); //get sheet by name
   // XSSFSheet sheet=book.getSheetAt(0)  ; //get sheet by index number 
      
      int rows=sheet.getLastRowNum();
       
      int cols=sheet.getRow(0).getLastCellNum(); //1st focus on first row than getLastCellNum();
     
      System.out.println("Number of rows in sheet:"+rows); //get number of rows in excel sheet1
      
      System.out.println("Number of columns in sheet:"+cols); //get number of columns in excel sheet
      
      //get all rows and column data from excel
      
      for(int i=0; i<rows;i++)
      {
    	   XSSFRow currentRow=sheet.getRow(i); //focus on current row row and than increment count
    	  
    	  for(int j=0; j<cols;j++)
    	  {
    	
    		  String data=currentRow.getCell(j).toString();
    		  System.out.print("  "+data);
    	  }
    	  System.out.println();
      }
      
 
      
      
	}

}
