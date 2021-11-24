/*to automate BarCode/QR code in web application we required third party API support
Selenium WebDriver doesn't support to read bar code images 
to read bar-code image in WebDriver we have to use Zxing Api 
download two jar file from maven repository 
1. ZXing Core
2. ZXing Java SE Extensions
*/
package BarCodeReader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCodeReaderDemo {

	public static void main(String[] args) throws IOException, NotFoundException 
	{
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
       
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement element=driver.findElement(By.xpath("//div[@id='HTML12']/div/img[1]"));
		
		String BarCodeurl=element.getAttribute("src");
		
		URL BarCodeImageUrl=new URL(BarCodeurl); //it will convert string url to original URL format
		
		
		BufferedImage bufferedImage=ImageIO.read(BarCodeImageUrl);
		
		LuminanceSource luminanceImageSource= new BufferedImageLuminanceSource(bufferedImage);
		
	
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceImageSource)); //1st way
		
		/*HybridBinarizer binarizer=new HybridBinarizer(luminanceImageSource); //2nd way
		BinaryBitmap binaryBitmap=new BinaryBitmap(binarizer);*/
		
		Result result=new MultiFormatReader().decode(binaryBitmap);
		
		System.out.println(result.getText());
		driver.close();
	}


	}


