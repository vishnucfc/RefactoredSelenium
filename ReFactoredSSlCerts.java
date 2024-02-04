package basictest;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReFactoredSSlCerts {
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		
		
		
	}
	
	@Test
	public void test() {
		
	}
	
	@AfterTest
	public void aftertest() {
		
	}
	
}
