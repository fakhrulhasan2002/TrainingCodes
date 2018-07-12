package com.gridsel;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SecondCase {
	
	public static WebDriver driver = null;
	RemoteWebDriver driver1=null;
	//String browserName;
	@Parameters({"platform","browserName","url"})
	@BeforeClass(alwaysRun=true)
	  public void beforeClass(String platform,String browserName, String url) throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\fakhr\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		//browserName=caps.getBrowserName();
		System.out.println(browserName);
		//caps.setPlatform(Platform.WIN10);
		if(browserName.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\fakhr\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		 //FirefoxOptions options = new FirefoxOptions();//.firefox();
		 //options.
		 caps = DesiredCapabilities.firefox(); 
		 //caps.setCapability("marionette", true);	
		 // caps.setCapability("moz:firefoxOptions", true);
		 //caps.setBrowserName("firefox");
		}else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fakhr\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
			caps = DesiredCapabilities.chrome();
		    caps.setCapability("--incognito", false);//"chrome.switches", Arrays.asList(
		  /* ChromeOptions options = new ChromeOptions();
		   options.setCapability("--incognito", true);
		   options.setCapability("test-type", true);
		   options.addArguments("test-type");*/
			//caps.getPlatform();
		
		}
		  
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  // Open URL of Application
		  driver.get("http://www.google.com");
		  
	  }
	  @Test
	  public void f1() {
	  }
	  
	  @Test
	  public void f2() {
	  }
	  @Test
	  public void f3() {
	  }
	  @Test
	  public void f4() {
	  }

}
