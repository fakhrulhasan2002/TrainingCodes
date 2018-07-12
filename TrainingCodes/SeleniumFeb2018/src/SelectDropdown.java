import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("http://newtours.demoaut.com/mercuryregister.php");
		WebElement str = dr.findElement(By.name("country"));
		
		Select sl = new Select(str);
		Thread.sleep(2000);
		sl.selectByIndex(10);
		Thread.sleep(2000);
		sl.selectByValue("32");
		Thread.sleep(2000);
		sl.selectByVisibleText("MADAGASCAR");
	}

}
