package pollscm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollScMTest {
	@Test
	public void run() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("poll scm class executed",true);
	}

}
