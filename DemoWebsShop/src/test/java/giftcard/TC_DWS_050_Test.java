package giftcard;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_050_Test extends BaseClass{

	@Test
	public void clickOnGiftCards()
	{
		ExtentTest test = ereport.createTest("clickOnGiftCards");
		test.log(Status.INFO, "login is completed");
		HomePage hp=new HomePage(driver);
		hp.getGiftcardslink().click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Gift Cards", "Gift Cards page not displayed");
		
		
		test.log(Status.PASS, "Gift Cards page is displayed");
	}
}
