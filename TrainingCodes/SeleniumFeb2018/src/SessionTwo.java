import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//ClassName
		/*List<WebElement> elements = driver.findElements(By.className("inputtext"));
		System.out.println(elements.size());
		elements.get(0).sendKeys("sdfdsaff@gmail.com");
		elements.get(1).sendKeys("fdhydhth");
		driver.findElement(By.id("loginbutton")).click();*/
		List<WebElement> ele = driver.findElements(By.tagName("h2"));
		System.out.println(ele.size());
		
		String str = driver.findElement(By.xpath("//label[@for='email']")).getText();
		System.out.println(str);
		
		Thread.sleep(4000);
		driver.close();
	}

}
