package apperalandshpe;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_030_Test extends BaseClass{


	@Test
	public void clickonApperalAndShoe()
	{
		ExtentTest test = ereport.createTest("clickonApperalAndShoe");
		test.log(Status.INFO, "Login is completed");
		
		HomePage hp=new HomePage(driver);
		hp.getApparelandshoes().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes","Apparel & Shoes is not displayed");
		
		
		test.log(Status.PASS, "apperal page is displayed");
		
	}
	
}
