package JUnit;

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

public class ClassOne {

	static WebDriver driver;
	@BeforeClass //annotaion
	public static void setUpBeforeClass() throws Exception {
		System.out.println("1- Before Class");
		driver = new FirefoxDriver();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("1- After Class");
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("1- Setup Before");
		driver.get("http://www.facebook.com");
		assert(driver.getTitle().contains("Facebook"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("1- Setup After");

	}

	//@Ignore("Test is ignored as a demonstration")
	@Test
	public void TC0001() {
		//fail("Not yet implemented");
		System.out.println("1- Test 1");
		
		driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asdfgb");
		driver.findElement(By.id("loginbutton")).click();
		String str=driver.findElement(By.xpath("//div[@data-click='home_icon']")).getText();
		Assert.assertEquals(str, "Home");
	}
	@Test
	public void TC0002() {
		//fail("Not yet implemented");
		System.out.println("1- Test 2");
		driver.findElement(By.partialLinkText("account?")).click();
		String str = driver.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[1]/div/div[2]/h2")).getText();
		Assert.assertEquals(str, "Find Your Account");
	}
	@Test
	public void TC00100() {
		//fail("Not yet implemented");
		System.out.println("1- Test 3");
		int a=10;
		Assert.assertEquals(a, 9);
	}
}
