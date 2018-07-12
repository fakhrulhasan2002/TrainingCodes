import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.hdfcbank.com");
		driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		
		
		/*driver.get("http://www.icicibank.com");
		
		List<WebElement> lt = driver.findElements(By.xpath("//div[@id='push-modal-close']"));	
	    lt.get(0).click();
	    
	    Thread.sleep(2000);
		List<WebElement> toElement = driver.findElements(By.xpath("//*[@href='/Personal-Banking/products.page?']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(toElement.get(0)).build().perform();
		Thread.sleep(2000);*/
		
		/*List<WebElement> loanElement = driver.findElements(By.xpath("//h5/a[@href='/Personal-Banking/loans/loans.page?'][@target='']"));
		ac.click(loanElement.get(0)).build().perform();*/
		
		WebElement toElement = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span"));//.click();
		//driver.findElement(By.linkText("Gold Loan")).click();
		Actions ac = new Actions(driver);
		ac.moveToElement(toElement).build().perform();
		ac.moveToElement(driver.findElement(By.linkText("Gold Loan"))).build().perform();
		ac.sendKeys(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")), "Gold Loan").build().perform();
		ac.sendKeys(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")), Keys.RETURN).build().perform();
		
		
	}

}
