package Base;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.PropertyConstant;



public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	static String fileName = PropertyConstant.orlocation;
	public static Properties config; 
	
	public static WebDriver init(String url) throws IOException{
		FileInputStream file = new FileInputStream(new File(fileName));
		config=new Properties();
		config.load(file);
		if(PropertyConstant.browser.equalsIgnoreCase("chrome")) {
				String key="webdriver.chrome.driver";
				System.out.println("Opening Chrome");
				String value="C:\\Users\\Ronak Shah\\Desktop\\selenium\\chrome driver\\chromedriver.exe";
				System.setProperty(key, value);
				//driver=new FirefoxDriver();
				driver=new ChromeDriver();
				System.out.println("Chrome Driver");
		
		}else if(PropertyConstant.browser.equalsIgnoreCase("firefox")){
		
		   driver=new FirefoxDriver();
		   
	}else if(PropertyConstant.browser.equalsIgnoreCase("ie")) {
				String key="webdriver.internetexplore.driver";
				String value="Download/IE/iedriver.exe";
				System.setProperty(key, value);
				driver=new InternetExplorerDriver();
	    }else {
	    	System.out.println("Browser deined in Property Constant file is not supported");
	    }
	
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
	
	public static void tearDown() {
		driver.quit();
	}
	
}
