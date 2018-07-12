import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://www.mckesson.ca/");
		 driver.findElement(By.xpath(".//*[@id='top-nav']/li[5]/a[3]/img")).click();
		 
		 Set<String> handle = driver.getWindowHandles();

		 for(int i = 0;i<handle.size();i++){ //foreach
			 System.out.println(handle);
		 }
		 Iterator<String> itr = handle.iterator();
		 String pr = itr.next();
		 String ch = itr.next();
		 Thread.sleep(2000);
		 driver.switchTo().window(ch);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("abc@gmail.com");
		 Thread.sleep(2000);
		 driver.switchTo().window(pr);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='search-form']/input[7]")).sendKeys("Motrin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='search-form']/input[8]")).click();
		 Thread.sleep(2000);
		 driver.switchTo().window(ch);
		 Thread.sleep(2000);
		 driver.navigate().refresh();
	}

}
