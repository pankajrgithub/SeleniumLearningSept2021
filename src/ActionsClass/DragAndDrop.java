package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		
     System.setProperty("webdriver.gecko.driver", "//geckodriver.exe");
     
     WebDriver driver=new FirefoxDriver();
     
     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
     
     Actions act=new Actions(driver);
     
     WebElement source1=driver.findElement(By.xpath("//div[@id='box3']"));
     
     WebElement target1=driver.findElement(By.xpath("//div[@id='box103']"));
     
     WebElement source2=driver.findElement(By.xpath(".//div[@id='box7']"));
     
     WebElement target2=driver.findElement(By.xpath("//div[@id='box106']"));
     
     //one way to drag and drop
     act.clickAndHold(source1).moveToElement(target1).release().build().perform();
     
     
     //second way to drag and drop
     
     act.dragAndDrop(source2, target2).build().perform();
     
	}

}
