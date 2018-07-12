import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver dr= new FirefoxDriver();
		File destFile = new File("C:\\Users\\Fakhrul\\Desktop\\Selenium_Appium_Lecture\\img01.jpg");
		dr.get("https://www.w3schools.com/");
		
		File file=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, destFile);
	}

}
