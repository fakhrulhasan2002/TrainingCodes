import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.espncricinfo.com");
		
		JavascriptExecutor jr= (JavascriptExecutor) driver;
		jr.executeScript("window.scroll(0,900)", "");
		
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle);
		
		Iterator<String> itr = handle.iterator();
		 String phandle = itr.next();
		 String chandle = itr.next();
		
		driver.switchTo().window(chandle);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot account?")).click();
		Thread.sleep(2000);
		driver.switchTo().window(phandle);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().window(chandle);
		driver.navigate().refresh();
	}

}
