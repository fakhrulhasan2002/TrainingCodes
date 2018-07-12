import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionTwoLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();//Selenium 2.0 and Mozilla 46.0
		/*System.setProperty("webdriver.chrome.driver", "C:\\");
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.internetexplorer.driver", "C:\\");
		WebDriver driver= new InternetExplorerDriver();
		System.setProperty("webdriver.safari.driver", "C:\\");
		WebDriver driver= new SafariDriver();*/
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("account?")).click();
		
	}

}
