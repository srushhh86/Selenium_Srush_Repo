package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer {

	@FindBy(partialLinkText = "Desktops")
	private WebElement desktoplink;
	
	@FindBy(partialLinkText = "Notebooks")
	private WebElement notebooklink;
	
	@FindBy(partialLinkText = "Accessories")
	private WebElement accessorieslink;
	
	public Computer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDesktoplink() {
		return desktoplink;
	}
	public WebElement getNotebooklink() {
		return notebooklink;
	}
	public WebElement getAccessorieslink() {
		return accessorieslink;
	}
	
	
}
