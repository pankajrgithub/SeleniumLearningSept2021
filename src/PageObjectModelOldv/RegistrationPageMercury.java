package PageObjectModelOldv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageMercury 
{
 WebDriver driver;
 
 //Identification of elements on webPage

 /*
 @FindBy(linkText="REGISTRATION")
 WebElement Reg;
 */
 //
 @FindBy(how=How.LINK_TEXT ,using="REGISTER")
 WebElement link;
 
 @FindBy(name="firstName")
 WebElement fname;
 
 @FindBy(name="lastName")
 WebElement lname;
 
 @FindBy(name="phone")
 WebElement phone;
 
 @FindBy(name="userName")
 WebElement email;
 
 @FindBy(name="address1")
 WebElement adrs;
 
 @FindBy(name="city")
 WebElement city;
 
 @FindBy(name="state")
 WebElement state;
 
 @FindBy(name="postalCode")
 WebElement code;
 
 @FindBy(name="country")
 WebElement country;
 
 @FindBy(name="email")
 WebElement user;
 
 @FindBy(name="password")
 WebElement pass;
 
 @FindBy(name="confirmPassword")
 WebElement confirm;
 
 @FindBy(name="Submit")
 WebElement submit;
 
 //operation and Action on WebPage
 RegistrationPageMercury(WebDriver d)
 {
	 driver=d;
	 
	 PageFactory.initElements(d, this); //Additional Method
 }
 
 public void registrationLink()
 {
	link.click();
 }
 
 public void firstName(String f_name)
 {
	 fname.sendKeys(f_name);
 }
 
 public void lastName(String l_name)
 {
	 lname.sendKeys(l_name);
 }
 
 public void phoneNum(String phoneNum)
 {
	 phone.sendKeys(phoneNum);
 }
 
 public void userEmail(String userEmail)
 {
	 email.sendKeys(userEmail);
 }
 public void userAddress(String address)
 {
	 adrs.sendKeys(address);
 }
 
 public void userCity(String cityUser)
 {
	 city.sendKeys(cityUser);
 }
 
 public void userState(String cityState)
 {
	 state.sendKeys(cityState);
 }
 
 public void userCode(String userCode)
 {
	 code.sendKeys(userCode);
 }
 public void userCountry()
 {
	 Select s=new Select(country);
	 s.deselectByIndex(2);
 }
 public void userName(String name)
 {
	 user.sendKeys(name);
 }
 public void userPass(String password)
 {
	 pass.sendKeys(password);
 }
 
 public void confirmPass(String confirmPass)
 {
	 confirm.sendKeys(confirmPass);
 }
 
 public void submitBtn()
 {
	 submit.click();
 }
}
