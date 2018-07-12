package TestNGSession;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNGSessionTwo {
	
	WebDriver driver;
	
  @Test(priority=1,description="Login Testcase", enabled=true, groups="Regression")
  public void testcase011() throws InterruptedException {
	  System.out.println("Login Success");
	  driver.findElement(By.id("email")).click();
	  driver.findElement(By.id("email")).sendKeys("fakhrulhasan2002@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Sesndtane_121985");
	  //String str=driver.findElement(By.xpath("//*[@type='submit'] [@data-testid='royal_login_button']")).getText();
	  //String str1= driver.findElement(By.id("content")).getText();
	  driver.findElement(By.id("loginbutton")).click();
	  Thread.sleep(5000);
	  boolean b = driver.findElement(By.linkText("Home")).isDisplayed();
	  Assert.assertEquals(b, true);
  }
  @Test(priority=2, description="Logout Testcase", dependsOnMethods="testcase011",enabled=true, groups="Regression")
  public void testcase012() {
	  System.out.println("Logout Success");
	  driver.findElement(By.id("userNavigationLabel")).click();
	  driver.findElement(By.xpath(".//*[@action='https://www.facebook.com/logout.php?button_name=logout&button_location=settings']")).click();
  }
  @Parameters({"name","age"})
  @Test(priority=3, description="Testcase Parameter",enabled=true, groups="Regression")
  public void testcase013(String name, String age) {
	  System.out.println("Parameters:Name"+name+"- Age:"+age);
	   }
  
  @BeforeClass
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterMethod() {
	  driver.quit();
  }

  /*@BeforeSuite
  public void beforeSuite() {
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
  }*/

}
