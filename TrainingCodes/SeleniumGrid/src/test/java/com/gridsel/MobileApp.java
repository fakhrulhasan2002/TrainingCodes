package com.gridsel;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class MobileApp {


	static AndroidDriver<MobileElement> driver;


		public static void main(String[] args) throws IOException, InterruptedException  {
			File classpathRoot = new File(System.getProperty("user.dir"));
			//File appDir = new File(classpathRoot, "/Apps/AcceleratorApp/");
			
			/* AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
			 service.start();
			 if (service == null || !service.isRunning()) {
				 throw new AppiumServerHasNotBeenStartedLocallyException("An appium server node is not started!");
				 }*/
			 
			File src = new File(classpathRoot,"src");
			File dest=new File(src,"ApiDemos-debug.apk");
			// TODO Auto-generated method stub
			DesiredCapabilities  cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android xemulator");
			cap.setCapability(MobileCapabilityType.NO_RESET, false);
			//cap.setCapability(MobileCapabilityType.FULL_RESET, false);
			//cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
			//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//cap.setCapability(MobileCapabilityType.LOCALE, false);
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 2000);
			//cap.setCapability(MobileCapabilityType.ORIENTATION, "Landscape");
			//cap.setCapability(MobileCapabilityType.UDID, "1234567890"); //Mac
			//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			cap.setCapability(MobileCapabilityType.APP,dest.getAbsolutePath() );
		
			//Runtime.getRuntime().exec("cmd /c start C:/Users/Fakhrul/Desktop/appiumstart.bat");
			 driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			 //driver = new AppiumDriver<AndroidElement>(service.getUrl(),cap);
			
			 List<MobileElement> listStr = driver.findElementsByClassName("android.widget.TextView");
		    //int i= listStr.size();
		    for(int j=0;j<listStr.size();j++)
		    {
		    	System.out.println(listStr.get(j).getText());
		    }
		   // driver.findElementByAndroidUIAutomator("new UIselector().text(”\Preference\”));
		    //driver.findElementById("com.gaana:id/icon").click();
		    //driver.findElementById("");
		    
		    //Point loc1 = driver.findElementById("android:id/text1").getLocation();
		    //System.out.println(loc1);
		    driver.swipe(25, 100, 25, 250, 3);
		    TouchAction ta= new TouchAction(driver);
		     List<MobileElement> el = driver.findElementsByClassName("android.widget.TextView");
		      el.get(8).tap(1, 2);
		     //driver.zoom(el);
		     //driver.zoom(x, y);
		     //ta.tap(el);
		    driver.wait(3);
		    driver.quit();
		}

	}


