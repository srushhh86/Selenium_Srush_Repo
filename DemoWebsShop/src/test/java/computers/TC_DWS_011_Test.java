package computers;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.Computer;
import objectrepository.HomePage;

public class TC_DWS_011_Test extends BaseClass {

	@Test
	public void clickOndesktop()
	{
		HomePage  hp=new HomePage(driver);
		WebElement comlink = hp.getComputerlink();
		wutil.mouseHover(driver, comlink);
		Computer comp=new  Computer(driver);
		//comp.getDesktoplink().click();
		
		
	}
}
