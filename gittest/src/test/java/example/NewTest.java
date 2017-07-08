package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*changed website 
 * to rediff.com*/

public class NewTest {
	 WebDriver driver;	
	@Test				
	public void testEasy() {	
	driver.get("http://rediff.com/");  
	String title = driver.getTitle();				 
	System.out.println("get title "+title);
	System.out.println("added new sysout");
}	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		   
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
