package MavenProject.MavaneProjectFeb2018;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestCaseThree {
	
	static WebDriver driver;
	
  @Test(description="Title Verification",priority=1,enabled=true,groups={"Regression"})
  public void testcaseFour() {
	  System.out.println("testCaseFour");
	//Verify Title
			//System.out.println("TestCaseOne");
			String str=driver.getTitle();
			Assert.assertEquals("Facebook - Log In or Sign Up", str);
			//Assert.assertFalse(true);
  }
  @Parameters({"name","pass","extra"})
  @Test(description="Invalid Login Test",priority=2,timeOut=8000,groups={"Regression"})
  public void testcaseFive(String username, String password, String str2) {
	  System.out.println("testCaseFive");
	//Login Feature
			//System.out.println("TestCaseTwo");
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).click();
			boolean str = driver.findElement(By.linkText("Sign up for Facebook")).isDisplayed();
			System.out.println("This is extra:"+str2);
			Assert.assertTrue(str);
  }
  @Test(description="Forgot Account",priority=3,enabled=true,dependsOnMethods="testcaseFour")
  public void testcaseSix() {
	  System.out.println("testCaseSix");
	//Forgot account
			//driver.navigate().back();
			//System.out.println("TestCaseThree");
			driver.findElement(By.linkText("Forgot account?")).click();
			boolean res = driver.findElement(By.xpath("//*[contains(text(),'Please enter your email')]")).isDisplayed();
		    Assert.assertTrue(res);
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("beforeMethod");
	  driver= new FirefoxDriver();
	  driver.get("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("afterMethod");
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

}
