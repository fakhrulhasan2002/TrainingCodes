package test;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestCase1 {
  WebDriver driver;
  LoginPage lp;
  String url="http://www.facebook.com";
	
  
  @Test(priority=1)
  public void TC001() {
	   
		lp.loginToPage("abcd@gmail.com","dgfdgfdg" );
}
	@Test(priority=2)
  public void TC002(){
		lp.getforgotAccount();
	
	}
  
	@BeforeTest
  public void beforeTest() {
      driver=new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get(url);
	  System.out.println(driver.getTitle());
	  lp = new LoginPage(driver);
  }

  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
    driver.quit();
  }

}
