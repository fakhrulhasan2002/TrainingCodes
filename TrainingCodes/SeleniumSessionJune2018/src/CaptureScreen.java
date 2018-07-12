import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreen extends TestBase{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String destFile = "C:\\Users\\Fakhrul\\Downloads\\CaptureScreen.jpg";
		String url="http://www.facebook.com";
		init(url);
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(destFile));
	
	}

}
