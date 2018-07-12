package JUnitFramework;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Session2 {

	static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		driver.close();
	}

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test: Enter Username and Password and click login button");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dgfdgfdg");
		driver.findElement(By.id("loginbutton")).click();
		String a = driver.findElement(By.xpath("//*[@for='email']")).getText();
		assertEquals("Log In", a);
	}

	@Test
	public void test2() throws IOException {
		System.out.println("Test: Click on forgot account");
		driver.findElement(By.linkText("Forgot account?")).click();
		assertTrue(true);
	}

}
