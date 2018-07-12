package testcases;

import org.testng.annotations.Test;

import Base.TestBase;
import config.PropertyConstant;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class FacebookTCs {
	static WebDriver driver;
	
@BeforeMethod(alwaysRun=true)
	  public void beforeClass() throws IOException {
		  driver=TestBase.init(PropertyConstant.url);
	  }
  @Test(priority=2, description="Unsuccessful login scenario", groups= {"sanity", "Reg"})
  public void UnsuccessfulloginTest() throws InterruptedException {
	  driver.findElement(By.id(TestBase.config.getProperty("username"))).sendKeys("dfsvadfvadfvafd");
	  driver.findElement(By.id(TestBase.config.getProperty("password"))).sendKeys("cvesrg");
	  driver.findElement(By.id(TestBase.config.getProperty("loginbutton"))).click();
	  Thread.sleep(2000);
	  String actual = driver.findElement(By.xpath(TestBase.config.getProperty("failedscreen"))).getText();
	  Assert.assertEquals("Recover Your Account", actual);
  }
  @Test(priority=1,description="Forgot Account scenario", dependsOnMethods="LoginSuccessTest", groups="sanity")
  public void ForgotAccountTest() {
	  driver.findElement(By.partialLinkText(TestBase.config.getProperty("forgotlink"))).click();
	  String actual = driver.findElement(By.xpath(TestBase.config.getProperty("forgotverify"))).getText();
	  Assert.assertEquals("Find Your Account", actual);
  }
  @Test(priority=3,enabled=true, description="successful login scenario")
  public void LoginSuccessTest() {
	  Assert.assertFalse(false);
  }
  
  

  @AfterMethod(alwaysRun=true)
  public void afterClass() {
	  TestBase.tearDown();
  }

}
