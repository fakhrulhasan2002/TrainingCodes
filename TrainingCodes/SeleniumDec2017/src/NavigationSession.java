import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.indeed.ca");
       
       driver.findElement(By.partialLinkText("Sign")).click();
       
       //Back
       driver.navigate().back();
       Thread.sleep(2000);
       //forward
       driver.navigate().forward();
       Thread.sleep(2000);
       //refresh
       driver.navigate().refresh();
       Thread.sleep(2000);
       //to URL
       driver.navigate().to("http://www.facebook.com");
       Thread.sleep(2000);
       //Navigate to String
       driver.navigate().to("Google");
       
	}

}
