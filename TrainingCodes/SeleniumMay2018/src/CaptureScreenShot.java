import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ksrtc.in");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:/Users/Fakhrul/Downloads/screenshot.jpg");
	    FileUtils.copyFile(source, destination);
	}

}
