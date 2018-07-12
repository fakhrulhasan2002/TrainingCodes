import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumClassOne {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		File src = new File("src");
		File dest=new File(src,"base_gaana.apk");
		Runtime.getRuntime().exec("cmd /c start C:\\appiumStart.bat");
		Thread.sleep(15000);
		String url="http://127.0.0.1:4723/wd/hub";
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, dest.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TA9330BPD6");
		cap.setCapability(MobileCapabilityType.FULL_RESET, false );
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
		
		AndroidDriver driver = new AndroidDriver(new URL(url), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*driver.findElementById("com.gaana:id/btn_all_done").click();
		driver.findElementById("com.google.android.gms:id/credential_secondary_label").click();
		driver.findElementById("com.gaana:id/onboard_btn_google").click();
		driver.findElementById("com.google.android.gms:id/accept_button").click();*/
		driver.findElementById("com.gaana:id/seeall").click();
		driver.findElementByName("Home").click();
		driver.findElementByName("My Music").click();
		driver.findElementById("com.gaana:id/searchview_actionbar").click();
		driver.findElementByName("Search songs, albums, artists").click();
		driver.findElementByName("Search songs, albums, artists").sendKeys("Rashqe");
		driver.hideKeyboard();
		driver.findElementByName("Home").click();
		driver.findElementById("com.gaana:id/menu_icon").click();
		/*List ls = driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}*/
		driver.swipe(70, 300, 0, 300,2);
		
		TouchAction tc=new TouchAction(driver);
		
		//driver.close();
		driver.quit();

	}

}
