import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	static String fileName = "/src/ObjectRepository/OR.properties";
	public static WebDriver init(String url){
		String key="webdriver.chrome.driver";
		String value="C:/Users/Fakhrul/Downloads/chromedriver_win32/chromedriver.exe";
		System.setProperty(key, value);
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	/*public static void ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}*/
	
}
