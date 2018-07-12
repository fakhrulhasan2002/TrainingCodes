import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Session2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File src = new File("src");
		File dest=new File(src,"ApiDemos-debug.apk");
		// TODO Auto-generated method stub
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TA9330BPD6");
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
		AppiumDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		/*driver.sendKeyEvent(AndroidKeyCode.KEYCODE_1);
		driver.sendKeyEvent(AndroidKeyCode.KEYCODE_2);
		driver.sendKeyEvent(AndroidKeyCode.KEYCODE_X);*/
		
		//this is get view in Hyrid app
		Set vr = driver.getContextHandles();
		//this is to get current view 
		driver.getContext();
		//set view
		driver.context("view");
		
		///Hybrid Apploication:
		
	 	
		
	}

}
