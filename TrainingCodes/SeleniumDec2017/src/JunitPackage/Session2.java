package JunitPackage;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session2 {

	static WebDriver dr;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		dr=new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		dr.quit();
	}

	@Test
	public void testcase005() {
		System.out.println("TC005");
		dr.get("http://www.google.com");
		String abc = dr.getTitle();
		assertEquals("Google", abc);
	}
	@Test
	public void testcase006() {
		System.out.println("TC006");
		dr.get("http://www.facebook.com");
		String abc = dr.getTitle();
		assertEquals("Facebook", abc);
	}
	@Test
	public void testcase004() {
		System.out.println("TC004");
		dr.get("http://www.instagram.com");
		String abc = dr.getTitle();
		assertEquals("Instagram", abc);
	}

}
