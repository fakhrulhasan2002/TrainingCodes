package JUnitPackage;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TestcaseThree {
     
	static WebDriver driver;
	//Annotations
	@Before
	public void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
	}

	@After
	public void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		driver.quit();
		
	}

	@Test
	public void testCaseOne() {
		//Verify Title
		System.out.println("TestCaseOne");
		String str=driver.getTitle();
		assertEquals("Facebook - Log In or Sign Up", str);
	}
	@Test
	public void testCaseTwo() {
		//Login Feature
		System.out.println("TestCaseTwo");
		driver.findElement(By.id("email")).sendKeys("asfdfsfdgs@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vdsvav");
		driver.findElement(By.id("loginbutton")).click();
		boolean str = driver.findElement(By.linkText("Sign up for Facebook")).isDisplayed();
		assertTrue(str);
		
	}
	@Test
	public void testCaseThree() {
		//Forgot account
		//driver.navigate().back();
		System.out.println("TestCaseThree");
		driver.findElement(By.linkText("Forgot account?")).click();
		boolean res = driver.findElement(By.xpath("//*[contains(text(),'Please enter your email')]")).isDisplayed();
	    assertTrue(res);
	}

}
