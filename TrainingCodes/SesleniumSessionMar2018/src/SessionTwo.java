import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		/*List<WebElement> var = driver.findElements(By.tagName("input"));
		int a=var.size();
		System.out.println(a);
		var.get(0).sendKeys("sdafeqrag");*/
		//Absolutexpath
		//driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).click();
	
		//Relative Xpath
		driver.findElement(By.xpath("//input[@id='email'][@class='inputtext']")).sendKeys("sadfasdf@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("dasvadsf");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
	
		//css
		String s=".inputtext";
		driver.findElement(By.cssSelector(s)).click();
	}

}
