package TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GoogleSearch {
	
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

}
