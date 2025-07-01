package genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility  extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test=ereport.createTest(result.getName());
		test.log(Status.INFO, "test excecution started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test script is failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
		
		
		try {
			wutil.getPhoto(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Override
//	public void onTestSuccess(ITestResult result) {
//		test.log(Status.PASS, result.getName()+" is displayed");
//	}
//	
	

}
