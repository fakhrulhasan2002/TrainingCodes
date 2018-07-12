import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ksrtc.in");
		
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Alert al=driver.switchTo().alert();
		String str = al.getText();
		System.out.println(str);
		Thread.sleep(2000);
		al.accept();
		//al.dismiss();
		
		driver.findElement(By.xpath("//*[text()='Contact Us']")).click();
	}

}
