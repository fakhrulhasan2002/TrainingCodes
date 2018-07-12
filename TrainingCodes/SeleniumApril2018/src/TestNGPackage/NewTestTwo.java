package TestNGPackage;

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

public class NewTestTwo {
	
	WebDriver driver;
  @Parameters({"username2","password2"})	
  @Test(priority=1,description="invalid  login Test", enabled=true,groups={"Regression"})
  public void invalidloginTestTwo(String username, String password) {
		System.out.println("Test 1 Two");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		String actual = driver.findElement(By.partialLinkText("Recover")).getText();
		Assert.assertEquals(actual, "Recover Your Account");
		
	}
  @Test(priority=2, timeOut=10000, description="verify Forgot AccountLink",groups={"sanity"})
	public void verifyForgotAccountLinkTwo() {
		System.out.println("Test 2 Two");
		driver.findElement(By.partialLinkText("Forgot")).click();
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Forgot Password | Can't Log In | Facebook", "Forgot account link");
	}
  @Test(priority=3,description="valid Login",enabled=true)
  public void validLoginTwo() {
		System.out.println("Test 3 Two");
		Assert.assertFalse(true);
	}
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Before Method");
		driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("After Method");
		driver.quit();
  }

}
