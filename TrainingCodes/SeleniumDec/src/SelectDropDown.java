import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		WebElement sel = driver.findElement(By.cssSelector("[ name='country']"));
		
		Select sc = new Select(sel);
		Thread.sleep(2000);
		sc.selectByIndex(10); //ARuba
		Thread.sleep(2000);
		sc.selectByValue("38"); //CHINA
		Thread.sleep(2000);
		sc.selectByVisibleText("PITCAIRN ISLANDS");
		
	}

}
