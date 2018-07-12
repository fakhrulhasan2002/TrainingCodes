import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertHandling extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url="https://www.ksrtc.in/";
		init(url);
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Contact Us')]")).click();
	}

}
