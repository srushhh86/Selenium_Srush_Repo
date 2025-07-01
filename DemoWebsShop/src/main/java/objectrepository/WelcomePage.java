 package objectrepository;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(xpath = "//span[text()='Wishlist']" )
	private WebElement Whislistlink;
	
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWhislistlink() {
		return Whislistlink;
	}
	
	
}
