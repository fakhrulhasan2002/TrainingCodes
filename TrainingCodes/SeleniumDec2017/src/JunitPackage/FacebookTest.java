package JunitPackage;

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

public class FacebookTest {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		//driver=new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Classs");
		//driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		driver.quit();
	}

	@Test
	public void testcase008() {
		System.out.println("TC008");
		driver.get("http://www.facebook.com");
		String abc = driver.getTitle();
		assertEquals("Facebook", abc);
	}
	@Test
	public void testcase011(){
		System.out.println("TC011-Login");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("adsfdsf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dfsvkjfg");
		//String str=driver.findElement(By.xpath("//*[@type='submit'] [@data-testid='royal_login_button']")).getText();
		//String str1= driver.findElement(By.id("content")).getText();
		driver.findElement(By.id("loginbutton")).click();
	}
	@Ignore
	@Test
	public void testcase012(){
		System.out.println("TC012-Forgot Password");
		driver.findElement(By.linkText("Forgot account?")).click();
	}

}
