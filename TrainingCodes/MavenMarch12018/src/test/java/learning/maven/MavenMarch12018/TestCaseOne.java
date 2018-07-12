package learning.maven.MavenMarch12018;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCaseOne {
	
	WebDriver driver;
	
  @Test(priority=3, description="Verify Title", groups={"sanity"})
  public void funtionOne() {
	   System.out.println("FuntionOne");
	  //Verify Title
		String str=driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", str);
  }
  @Parameters({"email", "pass"})
  @Test(priority=2, description="Invalid Login check",timeOut=5000, enabled=true, groups={"sanity","Regression","functional"})
  public void funtionTwo(String email,String pass) {
	    System.out.println("FuntionTwo");
		driver.findElement(By.id("email")).sendKeys(email);//"asfdfsfdgs@gmail.com"
		driver.findElement(By.id("pass")).sendKeys(pass);//"vdsvav"
		driver.findElement(By.id("loginbutton")).click();
		boolean str = driver.findElement(By.linkText("Sign up for Facebook")).isDisplayed();
		Assert.assertTrue(str);
  }
  @Test(priority=1,description="Forgot Account",enabled=true, dependsOnMethods="funtionTwo", groups={"sanity","Regression","functional"})
  public void funtionThree() {
	    System.out.println("FuntionThree");
		driver.findElement(By.linkText("Forgot account?")).click();
		boolean res = driver.findElement(By.xpath("//*[contains(text(),'Please enter your email')]")).isDisplayed();
	    Assert.assertTrue(res);
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Before Method");
	  driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
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
	  System.out.println("After Suite");
  }

}
