package TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestScript {
  @Test(priority=1, description="Test1",timeOut=1000,groups={"sanity"})
  public void Test1() {
	  System.out.println("Test");
  }
  @Test(groups={"sanity"})
  public void Test2() {
	  System.out.println("Test");
  }
  WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		    System.out.println("Before Method");
		    driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
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
			/*int a=0;
		    int b=10;
		    int c=b/a;*/
		    System.out.println("Division");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void sample(){
		System.out.println("Sample");
		}


@AfterMethod
public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
}


  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
