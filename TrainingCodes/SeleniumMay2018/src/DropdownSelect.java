import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
		WebElement s = driver.findElement(By.name("country"));
		Select sl=new Select(s);
		sl.selectByIndex(200);
		Thread.sleep(2000);
		sl.selectByValue("27");
		Thread.sleep(2000);
		sl.selectByVisibleText("YUGOSLAVIA");
		Thread.sleep(2000);
		
	}

}
