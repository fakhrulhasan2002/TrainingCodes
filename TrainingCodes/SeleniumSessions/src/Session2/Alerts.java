package Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println((al.getText()));
		Thread.sleep(2000);
		al.accept();
		/*Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		//Options of Alert
		a.accept(); //Yes/OK/Accept
*/		//a.dismiss(); //No/Cancel/Dismiss
		//a.authenticateUsing(arg0);
	
		
	}

}
