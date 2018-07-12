import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		WebElement element = driver.findElement(By.xpath("//*[@name='country']"));
		
		Select sl=new Select(element);
		Thread.sleep(2000);
		sl.selectByIndex(100);
		Thread.sleep(2000);
		sl.selectByValue("249");
		Thread.sleep(2000);
		sl.selectByVisibleText("MIDWAY ISLANDS");
	}

}
