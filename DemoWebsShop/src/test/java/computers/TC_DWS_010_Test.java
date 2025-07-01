package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_010_Test extends BaseClass{
	
	@Test
	public void clickOnComputers()

	{
		
		ExtentTest test=ereport.createTest("clickOnComputers");
		test.log(Status.INFO, "login is completed");
		HomePage hp=new HomePage(driver);
		hp.getComputerlink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","computer page is not displayed");
		
		test.log(Status.PASS, "computer page is displayed");
	}
	

}
