/**
 * 
 */
package JunitPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

/**
 * @author Fakhrul
 *
 */
public class Session1 {

	/**
	 * @throws java.lang.Exception
	 */
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		//pre-condition
		System.out.println("Before");
		driver=new FirefoxDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//Post condition
		System.out.println("After");
		driver.quit();
	}

	@Test
	public void testcase001() {
		System.out.println("TC001");
		driver.get("http://www.google.com");
		String abc = driver.getTitle();
		assertEquals("Google", abc);
		
	}

	@Test
	public void testcase002() {
		System.out.println("TC002");
		driver.get("http://www.facebook.com");
		String xyz = driver.getTitle();
		assertEquals("Facebook - Log In or Sign Up",xyz);
	}
	@Test
	public void testcase003() {
		System.out.println("TC003");
		driver.get("http://www.Instagram.com");
		String mn = driver.getTitle();
		assertEquals("Instagram",mn);
	}
}
