import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.google.ca");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")).click();
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.scroll(0,600)", "");
		
		
	}

}
