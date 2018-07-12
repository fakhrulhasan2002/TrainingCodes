import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String str = driver.getTitle();
		System.out.println("Title: "+str);
		String str1 = driver.getCurrentUrl();
		System.out.println("Title: "+str1);
		//Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		/*driver.findElement(By.id("email")).sendKeys("asdffd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dsfgdfagd");*/
		
		driver.findElement(By.name("email")).sendKeys("asdffd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dsfgdfagd");
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
