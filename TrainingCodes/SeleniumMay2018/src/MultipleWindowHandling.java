
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
	
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		Iterator<String> itr = allwin.iterator();
		String pid = itr.next();
		String aid = itr.next();
		String gid= itr.next();
		//String did= itr.next();
		
		driver.switchTo().window(aid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[6]/a")).click();
		
		driver.switchTo().window(gid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Check out more content from Similar']")).click();
		
		driver.switchTo().window(pid);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='emailOrPhone']")).sendKeys("12345674856746");
	
	    //driver.close();
	    driver.quit();
	 
	}
}
