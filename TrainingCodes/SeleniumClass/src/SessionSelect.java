import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SessionSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		WebElement sel = driver.findElement(By.xpath("//*[@name='country']"));
		Select sl=new Select(sel);
		sl.selectByIndex(10);//ARUBA
		Thread.sleep(2000);
		sl.selectByValue("249");//AZERBAIJAN 
		Thread.sleep(2000);
		sl.selectByVisibleText("INDIA");//INDIA
		Thread.sleep(2000);
		
	}


}
