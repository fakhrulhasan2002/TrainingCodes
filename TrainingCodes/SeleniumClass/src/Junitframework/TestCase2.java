package Junitframework;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	
static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Before");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		System.out.println("After");
	}

	@Test
	public void googleSearch() {	//Search on Google
		try{
		System.out.println("Search word in Selenium");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")).click();
		String str= driver.getTitle();
	    assertEquals(str, "abc", "Title Check");
		////
		//Browser Navigation
		//
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//@Ignore("Functionality now working")
	@Test
	public void navigation() throws InterruptedException{
		System.out.println("Refresh");
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Back");
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("forward");
		driver.navigate().forward();
	}
	@Test
	public void divions(){
		
		try{
			int a=0;
		    int b=10;
		    int c=b/a;
		    System.out.println("C: "+c );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void sample(){
		System.out.println("Sample");
		}
}
