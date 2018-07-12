package Sesssion4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TestCase1 {
	
	static WebDriver driver;
	int a=10, b;
	//a=10;
	//@Ignore("Test is ignored as functionality is not working")
	@Test(timeout=1000)
	public void testA() {
		System.out.println("TestCase 1 - Test 1");
		
		/*driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")).click();*/
		//fail("Not yet implemented");
		a=10;
	}
	@Test
	public void TestB() throws InterruptedException{
		System.out.println("Testcase 1 -Test 2");
		int b=10;

		assertEquals(b, a);
		assertSame(b, a);
		/*driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();*/
	}
	
	@Before
	public void setUpBefore() throws Exception {
		System.out.println("TestCase 1 - Before");
		/*driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");*/
	}
	@After
	public void xyz(){
		System.out.println("Testcase 1-  After");
		//driver.close();
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("TestCase 1 - Before class");
		/*driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");*/
	}
	@AfterClass
	public static void xyzAfterClass(){
		System.out.println("TestCase 1 -After Class");
		//driver.close();
	}

}
