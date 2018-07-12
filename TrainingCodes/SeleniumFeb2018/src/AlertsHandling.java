import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver dr = new FirefoxDriver();
        dr.get("https://www.ksrtc.in");
        
        dr.findElement(By.xpath("//*[@id='searchBtn']")).click();
        Thread.sleep(2000);
        Alert al= dr.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(2000);
        al.dismiss();
        Thread.sleep(2000);
        dr.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
	}

}
