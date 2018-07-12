import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
	
		//Fluent Wait
	    Wait fw= new FluentWait(dr)
	    		.withTimeout(5, TimeUnit.SECONDS)
	    		.pollingEvery(2, TimeUnit.SECONDS)
	    		.ignoring(NoSuchElementException.class);
	    
	}

}
