package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class RefactoredDragAndDrop {
	WebDriver driver =null;
	WebElement element =null;
	WebElement drag=null;
	WebElement drop=null;
	
	
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com");
		System.out.println("Before test");
	}
	
	@Test
	public void test() {
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(element);
		drag= driver.findElement(By.id("draggable"));
		drop=driver.findElement(By.id("droppable"));
		new Actions(driver).dragAndDrop(drag,drop).perform();
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
		System.out.println("After test");
	}
	
	
	
	
}
