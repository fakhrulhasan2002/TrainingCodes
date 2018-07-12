import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

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
		List<WebElement> a = driver.findElements(By.xpath("//*"));
		System.out.println(a.size());
		for(WebElement s:a){
			System.out.println(s.getTagName());
		}
		System.out.println(driver.findElements(By.xpath("//*")).listIterator());
		/*driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("abcdg@gmail.com");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("Abcd@123");
		
		driver.findElement(By.id("loginbutton")).click();*/
		
		
	}

}
