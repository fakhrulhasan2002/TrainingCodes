import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		Date cl = new Date();
		System.out.println(cl.getTime());
		driver.get("http://toolsqa.com/automation-practice-form/");
		String destFile ="C:\\Users\\Fakhrul\\Downloads\\"+cl+"_screen.jpg"; 
		//((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(destFile));
	}

}
