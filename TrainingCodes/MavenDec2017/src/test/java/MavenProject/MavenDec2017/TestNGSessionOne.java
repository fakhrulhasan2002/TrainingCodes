package java.MavenProject.MavenDec2017;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGSessionOne {
	
	WebDriver driver;
  @Test(priority = 3,description="TestCase One", groups={"sanity"})
  public void testcase001() {
	  System.out.println("TC001");
	  driver.get("http://www.facebook.com");
	  String abc = driver.getTitle();
	  assertEquals("Facebook", abc);
  }
  @Test(priority=4,description="TestCase Two", groups={"smoke"})//, "sanity","Regression"})
  public void testcase002() {
	  System.out.println("TC002");
	  System.out.println("Login");
	  driver.findElement(By.id("email")).click();
	  driver.findElement(By.id("email")).sendKeys("adsfdsf@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("dfsvkjfg");
	  //String str=driver.findElement(By.xpath("//*[@type='submit'] [@data-testid='royal_login_button']")).getText();
	  //String str1= driver.findElement(By.id("content")).getText();
	  driver.findElement(By.id("loginbutton")).click();
  }
  @Test(priority=6,description="TestCase Three", groups={"sanity"})
  public void testcase003() {
	  System.out.println("TC003");
	  System.out.println("Forgot Password");
	  driver.findElement(By.linkText("Forgot account?")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
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
	  System.out.println("AfterSuite");
  }

}
