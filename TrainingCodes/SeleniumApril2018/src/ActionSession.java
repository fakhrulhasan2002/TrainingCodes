import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com");
		
		Actions ac = new Actions(driver);
		/*boolean b = driver.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).isDisplayed();
		if(b==true){
		    ac.click(driver.findElement(By.xpath("//*[@id='cee_closeBtn']/img"))).build().perform();
		}*/
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//*[text()='Apply now']"))).build().perform();
		Thread.sleep(2000);
		//ac.click(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[2]/div[2]/div/ul/li[6]/a"))).build().perform();
	
		ac.click(driver.findElement(By.xpath("//input[@class='searchbox']"))).build().perform();
		ac.sendKeys(Keys.SHIFT).sendKeys("apply gold loan").build().perform();
		ac.sendKeys(Keys.RETURN).build().perform();
		for(int i=0;i<3;i++)
			ac.sendKeys(Keys.CONTROL).sendKeys(Keys.SHIFT).sendKeys(Keys.ADD).build().perform();
	}

}
