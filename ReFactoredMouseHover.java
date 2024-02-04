package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ReFactoredMouseHover {
	WebDriver driver =null;
	WebElement element = null;
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("Before test");
		
	}
	
	@Test
	public void test() {
		
		element =driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/a"));
		new Actions(driver).moveToElement(element).perform();
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
		System.out.println("After test");
	}
	
	
	
}
