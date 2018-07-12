import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboradActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr =new FirefoxDriver();
		dr.get("https://www.hdfcbank.com/");
		/*boolean src = dr.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).isDisplayed();
		if(src==true)
		     dr.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		*/
		WebElement toElement = dr.findElement(By.xpath("//*[text()='Apply now']"));
		
		Actions ac=new Actions(dr);
		ac.moveToElement(toElement).build().perform();
		ac.moveToElement(dr.findElement(By.xpath("//*[@class='mainlink'][text()='Gold Loan']"))).build().perform();
		//ac.click(dr.findElement(By.xpath("//*[@class='mainlink'][text()='Gold Loan']"))).build().perform();
		WebElement element = dr.findElement(By.xpath("//input[@class='searchbox']"));
		ac.sendKeys(element, Keys.SHIFT).build().perform();
		ac.sendKeys("z").build().perform();
		ac.sendKeys(element, Keys.SHIFT).build().perform();
		ac.sendKeys("dvasfgareg").build().perform();
		
	}

}
