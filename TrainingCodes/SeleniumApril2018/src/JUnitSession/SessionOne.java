package JUnitSession;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SessionOne {

	static WebDriver driver;
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		
	}*/

	/*@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}*/
    
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		driver.quit();
	}

	@Test
	public void invalidloginTest() {
		System.out.println("Test 1");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("fsdvfdg@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sdferf");
		driver.findElement(By.id("loginbutton")).click();
		String actual = driver.findElement(By.partialLinkText("Recover")).getText();
		Assert.assertEquals(actual, "Recover Your Account");
		
	}
	@Test
	public void verifyForgotAccountLink() {
		System.out.println("Test 2");
		driver.findElement(By.partialLinkText("Forgot")).click();
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Forgot Password | Can't Log In | Facebook", "Forgot account link");
	}
	
	//@Ignore("Test is ignored as a demonstration")
	@Test
	@Ignore
	public void validLogin() {
		System.out.println("Test 3");
		Assert.assertFalse(false);
	}

}
