package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RefactoredCheckBox {
WebDriver driver =null;
WebElement element =null;

@BeforeTest
public void beforetest() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.sugarcrm.com/request-demo");
	driver.manage().window().maximize();
	System.out.println("Before Test");
}

@Test
public void checkboxtest() {
	WebElement checkboxx=driver.findElement(By.xpath("//*[@id=\\\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\\\"]"));
    checkboxx.click();
    //additional functionalities
    System.out.println(element.getTagName());
	System.out.println(driver.getCurrentUrl());
	}

@AfterTest
public void aftertest() {
	driver.close();
	System.out.println("After Test");
}
	
	
}
