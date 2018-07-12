/**
 * 
 */
package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * @author Fakhrul
 *
 */
public class TestCaseTwo {

	static WebDriver driver;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	  
		System.out.println("Before Class");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		driver.quit();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void testOne() {
		System.out.println("TestCaseOne");
		//Get and verify the title of the page
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Facebook - Log In or Sign Up");
		
	}
	@Test
	public void testTwo() {
		System.out.println("TestCaseTwo");
		Assert.fail("Message");
	}
	@Test
	public void testThree() {
		System.out.println("TestCaseThree");
	}

}
