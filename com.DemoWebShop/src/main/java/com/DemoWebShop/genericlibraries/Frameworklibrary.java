package com.DemoWebShop.genericlibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import javax.swing.Action;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import dev.failsafe.Timeout;

public class Framelibrary  implements FrameWorkConstants {
  public Action action;
  public WebDriverWait wait;
  public SoftAssert softAssert;
  
	public  void selectClass(WebElement dropDown,String option) {
		Select select =new Select(dropDown);
		int counter=0;
		try{
			int indexValue=Integer.parseInt(option);
			select.selectByIndex(indexValue);
			counter++;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("not a index value");
		}
		if(counter==0) {
			try {
				select.selectByValue(option);
			}catch (Exception e) {
				select.selectByVisibleText(option);
			}
			
		}
		
	}
	public void takeScreenshot(WebDriver driver){
		LocalDateTime dateTime=LocalDateTime.now();
		String FileName = dateTime.toString().replaceAll(":", "-");
	    TakesScreenshot ts=(TakesScreenshot)driver;
		File dest=new File("./Screenshots/"+FileName+".png");
		File temp=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }


public void takeScreenshotofElement(WebElement Element)
{
	File dest=new File("./Screenshots/"+name()+".png");
	File temp=Element.getScreenshotAs(OutputType.FILE);
	
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


public String name() {
	LocalDateTime dateTime=LocalDateTime.now();
	String FileName = dateTime.toString().replaceAll(":", "-");
	return FileName;
	
}


public String getPropertyvalue(String key) throws IOException {
File file=new File ("./src/test/resources/PropertiesFile/ConfigureProperty");
FileInputStream fis=new FileInputStream(file);
Properties  prop = new Properties();
prop.load(fis);
return prop.getProperty(key);
}
public void initObjects(WebDriver driver) {
	action=new Actions(driver);
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	softAssert=new SoftAssert();
}
public void scrollActionTillWebElement( WebElement element){
	action.scrollToElement(element).build();
	
	
	
}
}
