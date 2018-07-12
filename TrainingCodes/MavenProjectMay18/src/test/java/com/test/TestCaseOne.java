package com.test;

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
	
  static WebDriver driver;
  
  @Test(priority=2,description="This is Test 1", groups={"sanity"})
  public void getpasswordreset() {
	  System.out.println("Test 1");
	  driver.findElement(By.partialLinkText("account?")).click();
		String actual = driver.findElement(By.xpath("//*[@value='Search']")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "");
  }
  @Test(priority=3,description="This is Test 3", dependsOnMethods="getpasswordreset",groups={"sanity","Regression"})
  public void valideUserVerify() {
	  System.out.println("Test 3");
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadvfagrg@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dasvfSV");
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    //String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    //Assert.assertEquals(actual, " Login");
	    Assert.assertTrue(false);
  }
  @Parameters({"username","password"})
  @Test(priority=1,description="This is Test 2")
  public void invalideUserVerify(String username, String password) {
	  System.out.println("Test 2");
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    Assert.assertEquals(actual, "Recover Your Account");
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Before Method");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
  }

  /*@BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }*/

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  /*@BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }*/

}
