package AppiumSessionTwo;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class TouchAction {
	
	AndroidDriver driver;
	io.appium.java_client.TouchAction tc;
	
@BeforeClass
public void beforeClass() throws IOException, InterruptedException {
     
	    /*File src = new File("src");
		File dest=new File(src,"base_gaana.apk");*/
		Runtime.getRuntime().exec("cmd /c start C:\\appiumStart.bat");
		Thread.sleep(30000);
		String url="http://127.0.0.1:4723/wd/hub";
		
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.APP, dest.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TA9330BPD6");
		//cap.setCapability(MobileCapabilityType.FULL_RESET, false );
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
		
		driver=new AndroidDriver(new URL(url), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://m.facebook.com");
	  }
	
  @Test()
  public void TestTouch() {
	  System.out.print("Ignored");
	        /*tc=new io.appium.java_client.TouchAction(driver);
	  		tc.tap(driver.findElementById("com.gaana:id/seeall"));
	  		driver.findElementById("com.gaana:id/btn_all_done").click();
	  		driver.findElementById("com.google.android.gms:id/credential_secondary_label").click();
	  		driver.findElementById("com.gaana:id/onboard_btn_google").click();
	  		driver.findElementById("com.google.android.gms:id/accept_button").click();
	  		tc.tap(driver.findElementByName("Home"));
	  		tc.tap(driver.findElementByName("My Music"));
	  		tc.tap(driver.findElementById("com.gaana:id/searchview_actionbar"));
	  		
	  		tc.tap(driver.findElementByName("Search songs, albums, artists"));
	  		driver.findElementByName("Search songs, albums, artists").sendKeys("Rashqe");
	  		driver.hideKeyboard();
	  		tc.tap(driver.findElementByName("Home"));
	  		tc.tap(driver.findElementById("com.gaana:id/menu_icon"));
	  		List ls = driver.findElementsByClassName("android.widget.TextView");
	  		for(int i=0;i<ls.size();i++){
	  			System.out.println(ls.get(i));
	  		}
	  	
	  		driver.swipe(70, 300, 0, 300,2);	
*/
	  	}

 

  @AfterClass
  public void afterClass() {
	//driver.close();
		driver.quit();
  }

}
