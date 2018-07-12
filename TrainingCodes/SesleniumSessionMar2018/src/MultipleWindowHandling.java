import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr =new FirefoxDriver();
		dr.get("https://www.instagram.com");
		
		//open apple page
		dr.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		
		//open google play
		dr.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
	    ///Window handling
		Set<String> var = dr.getWindowHandles();
		System.out.println(var);
		Iterator<String> itr = var.iterator();
	    String mainWin = itr.next();
	    String win1 = itr.next();
	    String win2 = itr.next();
		
		///
	    
	    Thread.sleep(2000);
	    dr.switchTo().window(win1);
	    System.out.println(dr.getTitle());
		dr.findElement(By.xpath("//*[@id='ember759']")).click();
		
		Thread.sleep(2000);
		dr.switchTo().window(win2);
		System.out.println(dr.getTitle());
		dr.findElement(By.xpath("//*[text()='See more']")).click();
		
		Thread.sleep(2000);
		dr.switchTo().window(mainWin);
		System.out.println(dr.getTitle());
		dr.findElement(By.xpath("//*[@name='emailOrPhone']")).sendKeys("1234567890");
	}

}
