import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr= new FirefoxDriver();
		//window1
		dr.get("https://www.instagram.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dr.findElement(By.xpath("//*[@name='emailOrPhone']")).click();
		dr.findElement(By.xpath("//*[@name='emailOrPhone']")).sendKeys("0123456789");
		//dr.findElement(By.xpath("//*[@name='fullName']")).click();
		dr.findElement(By.xpath("//*[@name='fullName']")).sendKeys("Selenium");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@alt='Available on the App Store']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@alt='Available on Google Play']")).click();
	////
		Set<String> handles = dr.getWindowHandles();
		System.out.println(handles);
		
		Iterator<String> itr = handles.iterator();
		String windowMain=itr.next();
		String windowApple=itr.next();
		String windowGoogle=itr.next();
		//window2
		Thread.sleep(2000);
		dr.switchTo().window(windowApple);
		Thread.sleep(2000);
		String act = dr.findElement(By.linkText("Instagram, Inc.")).getText();
		Assert.assertEquals(act, "Instagram, Inc.");
		
		//window3
		Thread.sleep(2000);
		dr.switchTo().window(windowGoogle);
		Thread.sleep(2000);
		String act1=dr.findElement(By.xpath("//*[@class='id-app-title']")).getText();
		Assert.assertEquals(act1, "Instagram");
		Thread.sleep(2000);
		dr.switchTo().window(windowMain);
		//main window
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		Thread.sleep(2000);
		dr.quit();
	}

}
