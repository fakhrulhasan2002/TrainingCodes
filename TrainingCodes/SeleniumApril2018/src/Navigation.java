import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		/*Thread.sleep(2000);
		driver.manage().window().fullscreen();*/
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Point a = driver.manage().window().getPosition();
		System.out.println("Position:"+a);
		Dimension b = driver.manage().window().getSize();
		System.out.println("Dimension:"+b);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("http://www.google.com");
		
	}

}
