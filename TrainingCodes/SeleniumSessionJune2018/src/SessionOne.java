import java.io.Reader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//public class SessionOne extends TestBase{
public class SessionOne extends TestBase{

	/*public static WebDriver driver;*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://www.facebook.com/";
		init(url);
		Thread.sleep(2000);
		//className usage
		/*String str="inputtext";
		List<WebElement> ele = driver.findElements(By.className(str));
		ele.get(0).sendKeys("hkjhadosoE@GKJHDKVA.COM");
		ele.get(1).sendKeys("cvaergfa");*/
		//s#login_form > table > tbody> tr:nth-child(2) > td:nth-child(1) >#email
		//link  text
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		String s = driver.findElement(By.xpath("//*[contains(@id,'login_')]//following::td/*[@for='email']")).getText();
		System.out.println(s);
		Assert.assertEquals(s, "Email or Phone");
		driver.findElement(By.xpath("//*[contains(@id,'login_')]//following::td/*[@type='email']")).getText();

		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}

}
