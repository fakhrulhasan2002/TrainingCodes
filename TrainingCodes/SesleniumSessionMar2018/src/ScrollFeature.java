import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollFeature {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,3200)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3200)", "");
		
		//driver.findElement(By.xpath("//*[text()='QUIZZES']")).click();
	}

}
