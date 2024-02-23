package com.DemoWebShop.genericlibraries;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Framelibrary{
	

	public WebDriver driver;
	@BeforeMethod
    public void browserSetup() throws IOException {
  if(getPropertyvalue("browser").equals("chrome")) {
           driver=new ChromeDriver();
      }else if(getPropertyvalue("browser").equals("firefox")){

	driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

	driver.get(getPropertyvalue("url"));
    initObjects(driver);
	}
	@AfterMethod

	public void browserTearDown() {
		driver.quit( );
        softAssert.assertAll();
	}
}