import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session1 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("account?")).click();
		/*driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asdfgb");
		driver.findElement(By.id("loginbutton")).click();*/
	
		/*List<WebElement> var = driver.findElements(By.className("inputtext"));
		var.get(0).sendKeys("sdjfkjfda@gmail.com");
		var.get(1).sendKeys("dsfgadf");
		driver.findElement(By.id("loginbutton")).click();*/
		
		/*List<WebElement> a = driver.findElements(By.xpath("//*"));
		for(int i=0;i<a.size();i++){
		  System.out.println(a.get(i).getTagName());
		}*/
	}

}
