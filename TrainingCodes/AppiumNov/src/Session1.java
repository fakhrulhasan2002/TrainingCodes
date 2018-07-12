import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Session1 {
	AndroidDriver driver;
	File src = new File("src");
	File dest=new File(src,"paytm.apk");
	
  @Test(priority=1)
  public void ContextCheck() {
	  System.out.println("Check context");
	  System.out.println(driver.getContextHandles());  
  }
  @Test(priority=2)
  public void GetMenuList() {
	  System.out.println("Get Menu List");
	  driver.findElement(By.xpath("//*[@content-desc='Paytm']")).click();  
  }
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TA9330BPD6");
	  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
	  cap.setCapability(MobileCapabilityType.APP, dest.getAbsolutePath());
	  cap.setCapability(MobileCapabilityType.NO_RESET, true);
	  cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
	  String url = "http://127.0.0.1:4723/wd/hub";
	  
	  driver = new AndroidDriver(new URL(url),cap);
	  driver.currentActivity();
  }

  @AfterClass
  public void afterClass() {
  }

}
