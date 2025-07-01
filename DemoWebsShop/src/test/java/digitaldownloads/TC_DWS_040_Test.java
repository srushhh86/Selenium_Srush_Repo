package digitaldownloads;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_040_Test  extends BaseClass {

	
	@Test
	public void clickonDigitaldownloads()
	{
		ExtentTest test = ereport.createTest("clickonDigitaldownloads");
		test.log(Status.INFO, "Login is completed");
		
		HomePage hp=new HomePage(driver);
		hp.getDigitaldownloadslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads","Digital downloads is not displayed");
		
		
		test.log(Status.PASS, "Digital downloads is displayed");
		
	}
	
}
