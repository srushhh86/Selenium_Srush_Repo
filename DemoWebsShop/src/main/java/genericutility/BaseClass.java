package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports ereport; // shd be able to access outside the package so public and through out it shoukd have only one instance so static
	public static ExtentTest test;
	
	
	public JavaUtility jutil=new JavaUtility(); // default means we cannot acces outside the package , so make it public
	public WebDriverUtility wutil=new WebDriverUtility();
	public FileUtility futil=new FileUtility();
	
	
	
	@BeforeSuite
	public void reportConfig()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtendReports_"+jutil.getSystemTime()+".html");
		 ereport=new ExtentReports();
		ereport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(futil.getDataFromProperty("url"));
		
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginlink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));
		lp.getPassword().sendKeys(futil.getDataFromProperty("password"));
		lp.getLoginbutton().click();
	}
	
	@AfterMethod
	public void logout()
	{
		HomePage hp=new HomePage(driver);
		hp.getLogoutlink().click();
	}
	@AfterClass
	public void closeBrower()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup()
	{
		ereport.flush();
	}

}
