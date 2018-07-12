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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCaseTwo {
	
  static WebDriver driver;
  @Test(priority=3,description="2 This is Test 1",groups={"sanity"})
  public void getpasswordreset_2() {
	  System.out.println("2 -Test 1");
	  driver.findElement(By.partialLinkText("account?")).click();
		String actual = driver.findElement(By.xpath("//*[@value='Search']")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "");
  }
  @Test(priority=1,description="2 This is Test 3",groups={"Regression"})
  public void valideUserVerify_2() {
	  System.out.println("2-Test 3");
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadvfagrg@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dasvfSV");
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    //String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    //Assert.assertEquals(actual, " Login");
	    Assert.assertTrue(false);
  }
  @Test(priority=2,description="2 This is Test 2",groups={"Regression"})
  public void invalideUserVerify_2() {
	  System.out.println("2-Test 2");
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sadvfagrg");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dasvfSV");
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    String actual = driver.findElement(By.xpath("//*[contains(text(),'Recover')]")).getText();
	    Assert.assertEquals(actual, "Recover Your Account");
  }
  /*@BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
		
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
  }*/

  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("2 -Before Class");
	  driver = new FirefoxDriver();
	  driver.get("http://www.facebook.com");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("2 -After Class");
	  driver.quit();
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
