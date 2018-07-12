import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionTwoClass {

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
			
			List<WebElement> str = driver.findElements(By.className("inputtext"));
			int x = str.size();
			System.out.println(x);
			str.get(0).clear();
			str.get(0).click();
			str.get(0).sendKeys("abcdg@gmail.com");
			str.get(1).clear();
			str.get(1).click();
			str.get(1).sendKeys("abcdg@gmail.com");
			
			//driver.findElement(By.className("uiButton uiButtonConfirm")).click();
			
			
			driver.findElement(By.id("loginbutton")).click();
			
			
		}


}
