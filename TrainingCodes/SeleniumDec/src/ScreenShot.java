import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\Fakhrul\\Desktop\\Selenium_Appium_Lecture\\test.jpg"));
	}

}
