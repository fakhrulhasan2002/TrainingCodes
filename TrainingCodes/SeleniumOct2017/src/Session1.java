import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver(); //Launches FireFox Browser
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com"); // Openinig webpage/URL
		//By ID
		/*driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dgfdgfdg");
		driver.findElement(By.id("loginbutton")).click();*/
		
		//By Class 
		/*List<WebElement> a = driver.findElements(By.className("inputtext"));
		a.get(0).sendKeys("testmessage");
		a.get(1).sendKeys("hjfyuuj");*/
		
		//By Xpath
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("eawfer");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sdfgregse");*/
		//By CSS
		/*driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sdfgfd");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("dsfgfd");*/
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).
		String a = driver.findElement(By.xpath("//*[@for='email']")).getText();
		System.out.println(a);
		

	}

}
