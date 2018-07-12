package Session3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//Open www.icicibank.com page
		//click on product
		//go to loans
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.icicibank.com");
		
		List<WebElement> lt = driver.findElements(By.xpath("//div[@id='push-modal-close']"));	
	    lt.get(0).click();
	    
	    Thread.sleep(2000);
		  List<WebElement> toElement = driver.findElements(By.xpath("//*[@href='/Personal-Banking/products.page?']"));
		
		 Actions ac= new Actions(driver);
		ac.moveToElement(toElement.get(0)).build().perform();
		Thread.sleep(2000);
		List<WebElement> loanElement = driver.findElements(By.xpath("//h5/a[@href='/Personal-Banking/loans/loans.page?'][@target='']"));
		ac.click(loanElement.get(0)).build().perform();
	}

}
