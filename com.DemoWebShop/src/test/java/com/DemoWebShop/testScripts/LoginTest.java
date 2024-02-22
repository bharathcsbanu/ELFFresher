package com.DemoWebShop.testScripts;

import org.testng.annotations.Test;

import com.DemoWebShop.POMRepository.Email;
import com.DemoWebShop.POMRepository.WelcomePage;
import com.DemoWebShop.genericlibraries.BaseTest;

public class LoginTest extends BaseTest {

	
@Test
public void TC_Login_001() throws InterruptedException {
WelcomePage wp=new WelcomePage(driver);
wp.clickLogin();
Thread.sleep(3000);
Email Ip=new Email(driver);
Ip.enterEmail("bbbb@gmail.com");
Thread.sleep(3000);
Password PD=new Password(driver);
PD.enterPassword("1234");
Thread.sleep(3000);


}

}











