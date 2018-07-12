package Session2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricinfo.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,600)", "");//scroll(0,500)
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> str = driver.getWindowHandles();
		for(String s:str)
		{
			System.out.println(s);//Print all available window handles
		}
		Iterator<String> itr=str.iterator();
		String par = itr.next(); //Assign the handle for first window
		String chl=itr.next();   //Assign the handle ID for second
		
		//Switch to child window
		driver.switchTo().window(chl);
		//click on child window
		driver.findElement(By.linkText("Forgot account?")).click();
		//switch back to parent window
		driver.switchTo().window(par);
		driver.navigate().refresh();
		
		driver.switchTo().window(chl);
		driver.navigate().refresh();
		
		
	}

}
