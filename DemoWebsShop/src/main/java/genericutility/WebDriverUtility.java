package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Srushti
 */
public class WebDriverUtility {

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to mouseHover on element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method is used to draganddrop from source to destination
	 * 
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	/**
	 * This method is used to right click on element
	 * 
	 * @param driver
	 * @param element
	 */

	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * This method is used to click and Hold on element
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * This method is used to select drop down by index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select ref = new Select(element);
		ref.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select ref = new Select(element);
		ref.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String VisibleText) {
		Select ref = new Select(element);
		ref.selectByVisibleText(VisibleText);
	}

	public String[] getAllOptions(WebElement element) {
		Select ref = new Select(element);
		List<WebElement> allOptions = ref.getOptions();

//		List<String> options=new ArrayList<>();
//		for(WebElement opt:allOptions)
//		{
//			options.add(opt.getText());
//		}
//		return options;
//		

		// or

//		String[] options=new String[allOptions.size()];
//		for(int i=0;i<allOptions.size();i++)
//		{
//			options[i]=allOptions.get(i).getText();
//		}
//		return options;

		String[] option = new String[allOptions.size()];
		int i = 0;
		for (WebElement opt : allOptions) {
			option[i++] = opt.getText();
		}

		return option;

	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);

	}

	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);

	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);

	}

	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();

	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void switchToWindow(WebDriver driver, String expectedurl) {
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains(expectedurl)) {
				break;
			}
		}
	}

	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jutil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + jutil.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);
	}

	public void javascriptScrollBy(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")", true);
	}

	public void javascriptScrollTo(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + x + "," + y + ")", true);
	}
}
