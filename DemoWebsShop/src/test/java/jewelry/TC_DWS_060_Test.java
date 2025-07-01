package jewelry;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_060_Test extends BaseClass{

	@Test
	public void clickOnJewelry()
	{
		ExtentTest test = ereport.createTest("clickOnJewelry");
		test.log(Status.INFO, "login is completed");
		HomePage hp=new HomePage(driver);
		hp.getJewelrylink().click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Jewelry", "Jewelry page not displayed");
		
		
		test.log(Status.PASS, "Jewelry page is displayed");
	}
}
