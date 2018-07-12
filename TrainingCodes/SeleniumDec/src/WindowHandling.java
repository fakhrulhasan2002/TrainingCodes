import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		
		JavascriptExecutor jr= (JavascriptExecutor) driver;
		jr.executeScript("window.scroll(0,900)", "");
		
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();

		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh);
		
		Iterator<String> itr = wh.iterator();
		String par = itr.next();
		String chApp = itr.next();
		String chGP = itr.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(chApp);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().window(chGP);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().window(par);
		driver.navigate().refresh();
	}

}
