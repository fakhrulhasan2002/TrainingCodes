package Session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement sel = driver.findElement(By.name("country"));
		Select item=new Select(sel);
		//item.selectByValue("92"); //Selecing INDIA
		//item.selectByIndex(92); //Selecting GRENADA
		item.selectByVisibleText("ZIMBABWE");
 		
		
	}

}
