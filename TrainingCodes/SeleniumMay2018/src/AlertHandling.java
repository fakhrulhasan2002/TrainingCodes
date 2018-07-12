import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://ksrtc.in");
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
	    Alert al= driver.switchTo().alert();
	    Thread.sleep(2000);
	    System.out.println(al.getText());
	    al.dismiss();
		
		driver.findElement(By.xpath("//*[@id='language']/a[1]")).click();
	}

}
