import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//macbook
		//System.setProperty("webdriver.chrome.driver" , "/Users/sampada/Applications/chromedriver");
        //System.setProperty("webdriver.chrome.driver", """); 
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        
        driver.findElement(By.partialLinkText("account?")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("http://www.google.com");
       
	}

}
