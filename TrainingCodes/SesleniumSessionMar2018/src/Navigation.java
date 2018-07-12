import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr =new FirefoxDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000);
		dr.navigate().forward();
		Thread.sleep(2000);
		dr.navigate().refresh();
		Thread.sleep(2000);
		dr.navigate().to("http://www.google.com");
	}

}
