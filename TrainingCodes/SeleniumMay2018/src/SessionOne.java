import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		/////////
		/*driver.findElement(By.id("email")).sendKeys("dagaggagas@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("zvasvv");
		driver.findElement(By.id("loginbutton")).click();*/
		//driver.findElement(By.linkText("Forgot account?")).click();
		/*driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath(".//*[@class='inputtext'][@type='email']")).sendKeys("zvf");
		*/
		/*driver.findElement(By.xpath("//*[@type='email'][@data-testid='royal_email']")).sendKeys("zfvfvavabgb");
		driver.findElement(By.xpath("//*[@data-testid='royal_pass'][@class='inputtext']")).sendKeys("");
		driver.findElement(By.xpath("//*[@type='submit'][@value='Log In']")).click();
		*/
		List<WebElement> a = driver.findElements(By.className("inputtext"));
		a.get(0).sendKeys("username@");
		a.get(1).sendKeys("password");
		driver.quit();
		
	}

}
