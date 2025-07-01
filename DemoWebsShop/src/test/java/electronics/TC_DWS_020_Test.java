package electronics;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_020_Test extends BaseClass{
	
	@Test
	public void clickOnElectronics()
	{
		ExtentTest test = ereport.createTest("clickOnElectronics");
		test.log(Status.INFO, "login is completed");
		HomePage hp=new HomePage(driver);
		hp.getElectronicslink().click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics", "electronic page not displayed");
		
		
		test.log(Status.PASS, "electronic page is displayed");
	}

}
