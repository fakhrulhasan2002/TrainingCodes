import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Session2 {
	AndroidDriver driver;
	File src = new File("src");
	File dest=new File(src,"paytm.apk");
	
  
  @Test(enabled = false, priority=1, description="CheckMenu", groups="sanity")
  public void CheckMenuList() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElementByXPath("//*[@content-desc='Paytm']").click();
	  List<MobileElement> text = driver.findElementsById("menu_title");
	  for(int i=0;i<text.size();i++){
		  System.out.println(text.get(i).getText());
	      
	  }
	  
	  driver.findElementByXPath("//*[@text='Sign Up']").click();
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_email']").sendKeys("asd@gmail.com");
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_password']").sendKeys("1234567890");
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/checkbox_referral']").click();
	  driver.hideKeyboard();
	  /*driver.findElementByXPath("//*[@text='Sign Up']").click();
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_field']").sendKeys("6476205861");
	  driver.hideKeyboard();
	  driver.findElementByXPath("//*[@text='Send Code']").click();*/
	  driver.closeApp();
	  
  }
  
  @Test(enabled = false, priority=2, description="MakePayment", groups="sanity")
  public void MakePayment() {
	//driver.launchApp();
	Point b = driver.findElementByXPath("//*[@text='Mobile']").getLocation();
	Point a = driver.findElementByXPath("//*[@text='Insurance']").getLocation();
	driver.swipe(a.getX(), a.getY(), b.getX(), b.getY(), 0);
	driver.zoom(driver.findElementByXPath("//*[@text='Insurance']"));
	driver.pinch(a.getX(), a.getY());

  }
  @Test(priority=3, description="Setting", groups="sanity")
  public void Setting() {
	  //Get context handle
	  /*driver.getContextHandles(); --> Get all context in app
	  //String name = driver.getContext(); get current context
	  //driver.context(name); set current context*/
	  
	  List<MobileElement> text = driver.findElementsById("menu_title");
	  for(int i=0;i<text.size();i++){
		  System.out.println(text.get(i).getText());
	      
	  }
	  TouchAction ac = new TouchAction(driver);
	  ac.tap(driver.findElementByXPath("//*[@content-desc='Paytm']"));
	  ac.tap(driver.findElementByXPath("//*[@text='Sign Up']"));
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_email']").sendKeys("asd@gmail.com");
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_password']").sendKeys("1234567890");
	  ac.tap(driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/checkbox_referral']"));
	  driver.hideKeyboard();
	  /*driver.findElementByXPath("//*[@text='Sign Up']").click();
	  driver.findElementByXPath("//*[@resource-id='com.one97.hero:id/edit_field']").sendKeys("6476205861");
	  driver.hideKeyboard();
	  driver.findElementByXPath("//*[@text='Send Code']").click();*/
//	  driver.closeApp();
	  
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
  }

  @AfterClass
  public void afterClass() {
  }

}
