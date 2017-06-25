package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;	
	@Test				
	public void testEasy() {	
	driver.get("http://demo.guru99.com/selenium/guru99home/");  
	String title = driver.getTitle();				 
	Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
	System.out.println("TEST 1");
	System.out.println("TEST 2");
	System.out.println("Added Branch1");
	System.out.println("back to branch1 work");
}	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		   
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
