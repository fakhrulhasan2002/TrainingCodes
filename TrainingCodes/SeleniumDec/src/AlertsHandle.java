import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://ksrtc.in");
		
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();
		//al.dismiss();
		
		driver.findElement(By.linkText("About Us")).click();
	}

}
