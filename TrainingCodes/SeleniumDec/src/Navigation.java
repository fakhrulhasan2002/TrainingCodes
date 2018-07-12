import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.partialLinkText("account?")).click();
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		//forward
		driver.navigate().forward();

	}

}
