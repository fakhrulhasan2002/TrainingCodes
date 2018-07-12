import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();	
		//click on forgot account
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		//back
		Thread.sleep(2000);
		driver.navigate().back();
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//close driver
		Thread.sleep(2000);
		driver.close();
	}

}
