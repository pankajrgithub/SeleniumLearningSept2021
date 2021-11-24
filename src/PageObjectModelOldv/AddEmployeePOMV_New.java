package PageObjectModelOldv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePOMV_New 
{
 WebDriver driver;
 
 //one way to find element
 /*
 @FindBy(how=How.ID,using="txtUsername")
 WebElement userName;
 */
 @FindBy(id="txtUsername") 
 WebElement userName;
 
 @FindBy(id="txtPassword")
 WebElement pass;
 
 @FindBy(id="btnLogin")
 WebElement submitBtn;
 
 @FindBy(xpath="//a[@id='menu_pim_viewPimModule']/b")
 WebElement pim;
 
 @FindBy(id="menu_pim_addEmployee")
 WebElement addEmp;
 
 @FindBy(id="firstName")
 WebElement firstName;
 
 @FindBy(id="lastName")
 WebElement lastName;
 
 @FindBy(id="photofile")
 WebElement brows;
 
 @FindBy(id="btnSave")
 WebElement saveBtn;
 
 //constructor with WebDriver argument
 public AddEmployeePOMV_New(WebDriver d)
 {
	driver=d;
	PageFactory.initElements(d, this); //Additional Method
 }
 
 public void userName(String uname)
 {
	userName.sendKeys(uname);
 }
 
 public void passWord(String pswd)
 {
	 pass.sendKeys(pswd);
 }
 
 public void btnClick()
 {
	  submitBtn.click();
 }
 public void pimClick()
 {
	  pim.click();
 }
 public void addEmpClick()
 {
	  addEmp.click();
 }

 public void firstName(String fname)
 {
	  firstName.sendKeys(fname);
 }
 public void lastName(String lname)
 {
	  lastName.sendKeys(lname);
 }
 public void sendImg(String img)
 {
	  brows.sendKeys(img);
 }
 
 public void saveBtn()
 {
	  saveBtn.click();
 }
}
