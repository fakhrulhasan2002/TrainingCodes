/**
 * 
 */
package Session2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String URL="http://www.google.ca";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")).click();
		////
		//Browser Navigation
		//
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		

	}

}
