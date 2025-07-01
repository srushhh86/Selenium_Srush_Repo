package books;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test  extends BaseClass{
	
	@Test
	public void clickonBooks()
	{
		
		HomePage hp=new HomePage(driver);
		hp.getBookslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. ","books page is not disp");
		
		
		test.log(Status.PASS, "Books page is displayed");
		
	}
	
	

}
