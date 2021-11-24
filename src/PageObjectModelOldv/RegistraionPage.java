package PageObjectModelOldv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistraionPage 
{
  WebDriver driver;
  //identification of elements
  
  By userName=By.id("txtUsername");
  By pass=By.id("txtPassword");
  By btnSubmit=By.id("btnLogin");
  By pim=By.xpath("//a[@id='menu_pim_viewPimModule']/b");
  By addEmp=By.id("menu_pim_addEmployee");
  By firstName=By.id("firstName");
  By lastName=By.id("lastName");
  By brows=By.id("photofile");
  By saveBtn=By.id("btnSave");
  
  
  //now perform actions/Operation method
  RegistraionPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void userName(String user)
  {
	  driver.findElement(userName).sendKeys(user);
  }
  public void passWord(String userPass)
  {
	  driver.findElement(pass).sendKeys(userPass);
  }
  public void btnClick()
  {
	  driver.findElement(btnSubmit).click();
  }
  public void pimClick()
  {
	  driver.findElement(pim).click();
  }
  public void addEmpClick()
  {
	  driver.findElement(addEmp).click();
  }

  public void firstName(String fname)
  {
	  driver.findElement(firstName).sendKeys(fname);
  }
  public void lastName(String lname)
  {
	  driver.findElement(lastName).sendKeys(lname);
  }
  public void sendImg(String img)
  {
	  driver.findElement(brows).sendKeys(img);
  }
  
  public void saveBtn()
  {
	  driver.findElement(saveBtn).click();
  }
}
