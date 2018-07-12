/**
 * 
 */
package Junitframework;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runners.MethodSorters;
/**
 * @author Fakhrul
 *
 */
@FixMethodOrder(MethodSorters.JVM)
public class TestCase1 {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
		driver.quit();
	}

	@Test
	public void googleSearch() {	//Search on Google
		try{
		System.out.println("Search word in Selenium");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")).click();
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
