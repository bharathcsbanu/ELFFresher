package com.DemoWebShop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{
	
 public BooksPage(WebDriver driver) {
     super (driver);

 }

 @FindBy(xpath="//a[text()=Computing and Internet ]/parent::h2/..//input")
  private WebElement computingAndInternetAddtoCartButton;

public void clickcomputingAndInternetAddtocartButton() {
	computingAndInternetAddtoCartButton.click();
	
}
@FindBy(xpath="//a[text() shopping cart']")
private WebElement shoppingCartLinkAfterAddingProductToCart;

public void clickBannerShoppingCartLink() {

shoppingCartLinkAfterAddingProductToCart.click();


}
}
