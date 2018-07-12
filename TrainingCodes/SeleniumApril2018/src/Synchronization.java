import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//implicit
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Expicit Wait timer
		WebDriverWait w= new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath(""))));
        
		FluentWait wait = (FluentWait) new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	}

}
