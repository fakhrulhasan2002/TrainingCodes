package JunitPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session3 {
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		driver=new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		driver.quit();
	}

	
	@Before
	public void setUp() throws Exception {
		//pre-condition
		System.out.println("Before");
		//driver=new FirefoxDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//Post condition
		System.out.println("After");
		//driver.quit();
	}

	@Test
	public void testcase007() {
		System.out.println("TC007");
		driver.get("http://www.google.com");
		String abc = driver.getTitle();
		assertEquals("Google", abc);
	}
	@Test
	public void testcase008() {
		System.out.println("TC008");
		driver.get("http://www.facebook.com");
		String abc = driver.getTitle();
		assertEquals("Facebook", abc);
	}
	@Test
	public void testcase009() {
		System.out.println("TC009");
		driver.get("http://www.instagram.com");
		String abc = driver.getTitle();
		assertEquals("Instagram", abc);
	}

}
