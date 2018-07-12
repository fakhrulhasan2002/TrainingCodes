package jUnitSession;

import static org.junit.Assert.*;

import java.sql.Driver;

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

public class TestCaseTwo {
 
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		driver.quit();
	}

	/*@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		driver.quit();
	}*/

	@Test
	public void getpasswordreset() {
		System.out.println("Test 1");
		driver.findElement(By.partialLinkText("account?")).click();
		String actual = driver.findElement(By.xpath("//*[@value='Search']")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "Search");
	}
	@Test
	public void invalideUserVerify() {
		System.out.println("Test 2");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadvfagrg");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dasvfSV");
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    Assert.assertEquals(actual, "Recover Your Account");
	}
	
	@Test
	public void valideUserVerify() {
		System.out.println("Test 3");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadvfagrg@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dasvfSV");
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    //String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    //Assert.assertEquals(actual, " Login");
	    Assert.assertTrue(false);
	    
	}
}
