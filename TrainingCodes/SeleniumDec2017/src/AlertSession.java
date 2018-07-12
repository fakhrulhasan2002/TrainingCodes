import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.ksrtc.in");
		
		dr.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		Alert al = dr.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();
		//al.dismiss();
		
		
		
		dr.findElement(By.xpath("//*[@id='singleLady']")).click();
	}

}
