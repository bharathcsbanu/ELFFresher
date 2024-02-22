package com.DemoWebShop.testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import org.testng.annotations.Test;

import com.DemoWebShop.POMRepository.HomePage;
import com.DemoWebShop.POMRepository.RegisterPage;
import com.DemoWebShop.POMRepository.WelcomePage;
import com.DemoWebShop.genericlibraries.BaseTest;
import com.DemoWebShop.genericlibraries.ExcelRead;

public class RegisterTest extends BaseTest {

@Test(dataProvider ="registerData")

public void TC_Register_001(String gender,  String firstname, String lastname, String email, String password) {

WelcomePage welcomePage= new WelcomePage (driver);
welcomePage.clickßegisterLink();


RegisterPage registerPage= new RegisterPage(driver);

if (gender.equalsIgnoreCase("M")) { 
	registerPage.clickMaleRadioButton();


} else if (gender.equalsIgnoreCase("F")) {
	registerPage.clickFemaleRadioButton();


} else {
	Reporter.log("Gender is not valid", true);
}

registerPage.enterFirstName(firstname); 
registerPage.enterLastName(lastname);

registerPage.enterEmail(email);
registerPage.enterPassword(password);

registerPage.enterConfirmPassword (password);

registerPage.clickRegisterButton();
HomePage homePage= new HomePage(driver);

try {
	softAssert.assertTrue(homePage.getlogoutLink().isDisplayed());
	
}catch(Exception e) {
	
 e.printStackTrace();

Reporter.log("User not registered");
}
}

@DataProvider (name = "registerData")

public String[][] registerDataProvider() throws EncryptedDocumentException, IOException{

return ExcelRead.multipleRead("register");


}
}





	







