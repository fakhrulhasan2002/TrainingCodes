import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new FirefoxDriver();
		dr.get("http://facebook.com");
		//Using ID using findelement
		/*dr.findElement(By.id("email")).sendKeys("asdfg@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("sdfgdfag");
		dr.findElement(By.id("loginbutton")).click();*/
		
		//Using Classname and findElements instead of findelement 
		
		/*List<WebElement> a = dr.findElements(By.tagName("span"));
		System.out.println("Total tagname:"+a.size());*/
		
		/*List<WebElement> lst = dr.findElements(By.className("inputtext"));
		System.out.println("Total Elements:"+lst.size());
		lst.get(0).sendKeys("sdfadg@gmail.com");
		lst.get(1).sendKeys("sdvdasv");
		dr.findElement(By.id("loginbutton")).click();*/
		
		//LinkText
		/*dr.findElement(By.linkText("Forgot account?")).click();*/
		
		//partial Linktext
		/*dr.findElement(By.partialLinkText("Forgot")).click();*/
		String var = dr.findElement(By.xpath("//*[@for='email']")).getText();
		System.out.println(var);
		String var1 = dr.findElement(By.xpath("//*[@for='pass']")).getText();
		System.out.println(var1);
		dr.findElement(By.cssSelector(""));
		//dr.close();

	}

}
