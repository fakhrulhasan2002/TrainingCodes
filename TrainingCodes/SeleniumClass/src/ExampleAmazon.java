import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Open Amazon url
		driver.get("http://www.amazon.ca");
		driver.manage().window().maximize();
	
		// Click on Hello Signin
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']")).click();
		// Go To Account
		//driver.findElement(By.xpath("//*[@id='nav_prefetch_yourorders']")).click();
		// Orders
		//List<WebElement> str = driver.findElements(By.xpath(".//*[@class='a-color-secondary']"));
		//str.get(0).click();
		//check check Box
		if(!driver.findElement(By.xpath("//input[@type='checkbox'][@name='rememberMe']")).isSelected()){
		       driver.findElement(By.xpath("//input[@type='checkbox'][@name='rememberMe']")).click();
		}
		
	}

}
