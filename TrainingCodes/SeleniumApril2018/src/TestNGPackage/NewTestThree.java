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

public class NewTestThree {
	
	WebDriver driver;

  @Parameters({"username3","password3"})		
  @Test(priority=1, description="invalid  login Test",groups={"Regression"})
  public void invalidloginTestThree(String username, String password) {
		System.out.println("Test 1 Three");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		String actual = driver.findElement(By.partialLinkText("Recover")).getText();
		Assert.assertEquals(actual, "Recover Your Account");
		
	}
  @Test(priority=2, timeOut=10000, description="verify Forgot AccountLink")
	public void verifyForgotAccountLinkThree() {
		System.out.println("Test 2 Three");
		driver.findElement(By.partialLinkText("Forgot")).click();
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Forgot Password | Can't Log In | Facebook", "Forgot account link");
	}
  @Test(priority=3,description="valid Login",enabled=true)
  public void validLoginThree() {
		System.out.println("Test 3 Three");
		Assert.assertFalse(false);
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
