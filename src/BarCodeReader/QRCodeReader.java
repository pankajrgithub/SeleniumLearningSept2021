package BarCodeReader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRCodeReader {

	public static void main(String[] args) throws IOException, NotFoundException 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//pankaj.rawat//OneDrive - Renovite Technologies Inc//Desktop//WebDriver//FireFoxDriver/geckodriver.exe");
	       
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		String QRurl=driver.findElement(By.xpath("//div[@id='HTML12']/div/img[2]")).getAttribute("src");

		URL QRImageURl=new URL(QRurl);
		
		//read image url in BufferedImage
		BufferedImage bufferedImage=ImageIO.read(QRImageURl);
		
		
		LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedImage);
		
		BinaryBitmap binary=new BinaryBitmap(new HybridBinarizer(luminancesource));
		
		Result result=new MultiFormatReader().decode(binary);
		
		System.out.println(result.getText());
		
		driver.close();
	}

}
