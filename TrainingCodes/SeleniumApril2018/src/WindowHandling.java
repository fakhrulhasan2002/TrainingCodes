import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
		
		
		Set<String> str = driver.getWindowHandles();
		System.out.println(str);
		
		Iterator<String> itr = str.iterator();
		String mainwindow = itr.next();
		String windowApple = itr.next();
		String windowGoogle = itr.next();
		
		driver.switchTo().window(windowApple);
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		driver.switchTo().window(windowGoogle);
		driver.findElement(By.linkText("See more")).click();
		
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//*[@aria-label='Mobile Number or Email']")).sendKeys("SeleniumTest");
		driver.findElement(By.xpath("//*[@aria-label='Full Name']")).sendKeys("dsadfgfg");
	}

}
