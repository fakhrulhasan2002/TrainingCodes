package com.gridsel;

import static org.testng.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridClass {

	WebDriver driver = null;
	 private StringBuffer verificationErrors = new StringBuffer();

	 // Pass plateform, browser and url parameters to launch browser and URL in given plateform.
	 @Parameters({ "platform", "browser", "url" })
	 @BeforeTest(alwaysRun = true)
	 public void setup(String platform, String browser, String url) throws MalformedURLException {
		 
		 
	  DesiredCapabilities caps = new DesiredCapabilities();
	  // Set Platforms based on parameter received from testng.xml.
	  caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
      
	  // Set browser capability based on parameter received from testng.xml.
	/*  if (browser.equalsIgnoreCase("Internet Explorer"))
	   caps = DesiredCapabilities.internetExplorer();*/
	  if (browser.equalsIgnoreCase("Firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\fakhr\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		  caps=DesiredCapabilities.firefox();
		  /*FirefoxOptions options = new FirefoxOptions();
		  options.addPreference("log", "{level: trace}");
		  options.addPreference("args", "{-profile, C:\\Users\\fakhr\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\}");
		  */
		  caps.setCapability("marionette", true);	
		  caps.setCapability("moz:firefoxOptions", false);
		  //driver=new FirefoxDriver(options);
		  //driver=new FirefoxDriver();
	  }
	  if (browser.equalsIgnoreCase("chrome")) {
	   caps = DesiredCapabilities.chrome();
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\fakhr\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   caps.setCapability("--incognito", false);//"chrome.switches", Arrays.asList(
	   /*ChromeOptions options = new ChromeOptions();
	   options.setCapability("--incognito", true);
	   options.setCapability("test-type", true);
	  // options.addArguments("test-type");

	    driver = new ChromeDriver(options);*/
	  // driver = new ChromeDriver();
	  }
	  // Open browser on grid node.
	  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  // Open URL of Application
	  driver.get("http://www.google.com");
	 }

	 // Simple test method to execute.
	 @Test(description = "Wait for button enabled")
	 public void waitForButtonEnabled() throws InterruptedException {
	 
	 }

	 // Simple test method to execute.
	 @Test(description = "Wait for button enabled", dependsOnMethods = { "waitForButtonEnabled" })
	 public void testCalc() throws InterruptedException {

	  // Get Browser name and version.
	  Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	  String browserName = caps.getBrowserName();
	  String browserVersion = caps.getVersion();

	  // Get OS name.
	  String os = System.getProperty("os.name").toLowerCase();

	  // Print test result with browser and OS version detail.
	  System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion + " Test Result = " + ITestResult.SUCCESS);
	 }

	 @AfterTest
	 public void afterTest() {
	  // Close the browser
	  driver.quit();
	 /* String verificationErrorString = verificationErrors.toString();
	  if (!"".equals(verificationErrorString)) {
	   fail(verificationErrorString);
	  }*/
	 }
	
}

