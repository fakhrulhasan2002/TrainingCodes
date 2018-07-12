import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SessionLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		//By ID and name Locator
		
		/*driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("adsfdsf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dfsvkjfg");
		String str=driver.findElement(By.xpath("//*[@type='submit'] [@data-testid='royal_login_button']")).getText();
		//String str1= driver.findElement(By.id("content")).getText();
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(str);
		//System.out.println(str1);
		Assert.assertEquals(str, "Log In");*/
		
		//By ClassName Locator - assuming that ID and name is not available
		 /*List<WebElement> arr = driver.findElements(By.className("inputtext"));
		System.out.println(arr.size());
		arr.get(0).click();
		arr.get(0).sendKeys("ddasfasdf@gmail.com");
		arr.get(1).sendKeys("fdsvdfg");
		
		driver.findElement(By.id("loginbutton")).click();*/
		
		//Link Text
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//Partial Link Text
		//driver.findElement(By.partialLinkText("account?")).click();
		
		//Code to find list of all tagname on website
		/*List<WebElement> str = driver.findElements(By.xpath("//*"));
		for(WebElement s:str)
		System.out.println(s.getTagName());*/
		
		//xpath
		String str=driver.findElement(By.xpath("//label[@for='email']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Email or Phone");
		
	}

}
