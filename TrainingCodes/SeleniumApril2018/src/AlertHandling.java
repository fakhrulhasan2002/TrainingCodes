import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       //System.out.println("test");
       WebDriver driver = new FirefoxDriver();
       driver.get("http://ksrtc.in");
       driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
       Thread.sleep(2000);
       Alert al = driver.switchTo().alert();
       String str = al.getText();
       System.out.println(str);
       al.accept();
       //al.dismiss();
       
	}

}
