package MavenProject.MavaneProjectFeb2018;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestCaseTwo {
	
	static WebDriver driver;
	
  @Test(description="Title Verification",priority=1,enabled=true,groups={"Regression","Functional"})
  public void testcaseNine() {
	  System.out.println("testCaseNine");
	//Verify Title
			//System.out.println("TestCaseOne");
			String str=driver.getTitle();
			Assert.assertEquals("Facebook - Log In or Sign Up", str);
  }
  @Test(description="Invalid Login Test",priority=2,timeOut=8000)
  public void testcaseSeven() {
	  System.out.println("testCaseSeven");
	//Login Feature
			//System.out.println("TestCaseTwo");
			driver.findElement(By.id("email")).sendKeys("asfdfsfdgs@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("vdsvav");
			driver.findElement(By.id("loginbutton")).click();
			boolean str = driver.findElement(By.linkText("Sign up for Facebook")).isDisplayed();
			Assert.assertTrue(str);
  }
  @Test(description="Forgot Account",priority=3,enabled=true,dependsOnMethods="testcaseNine")
  public void testcaseEight() {
	  System.out.println("testCaseEight");
	//Forgot account
			//driver.navigate().back();
			//System.out.println("TestCaseThree");
			driver.findElement(By.linkText("Forgot account?")).click();
			boolean res = driver.findElement(By.xpath("//*[contains(text(),'Please enter your email')]")).isDisplayed();
		    Assert.assertTrue(res);
  }
  @BeforeMethod(alwaysRun=true)
  void beforeMethod() {
	  System.out.println("beforeMethod");
	  driver= new FirefoxDriver();
	  driver.get("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("afterMethod");
	  driver.quit();
  }

  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("afterClass");
  }

}
