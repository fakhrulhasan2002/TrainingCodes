import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		WebElement abc = driver.findElement(By.xpath("//select[@name='country']"));
	    Select sl = new Select(abc);
	    sl.selectByIndex(0);
	    Thread.sleep(2000);
	    sl.selectByValue("225");
	    Thread.sleep(2000);
	    sl.selectByVisibleText("UNITED ARAB EMIRATES");
	    
	}

}
