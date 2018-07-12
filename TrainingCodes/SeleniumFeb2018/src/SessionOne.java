import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//Login: username, password and login button
		/*driver.findElement(By.id("email")).sendKeys("asdf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("adsfsdfa");
		driver.findElement(By.id("loginbutton")).click();*/
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
