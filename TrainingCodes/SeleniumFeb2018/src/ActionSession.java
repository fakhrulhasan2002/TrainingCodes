import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.icicibank.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ele = dr.findElements(By.xpath("//*[contains(text(),'Later')]"));
		//ele.get(0).click();
		WebElement toElement = dr.findElement(By.linkText("Apply Online"));
		
		Actions ac = new Actions(dr);
		ac.click(ele.get(0)).build().perform();
		ac.clickAndHold();
		ac.moveToElement(toElement).build().perform();
		ac.release();
		WebElement eleOne = dr.findElement(By.linkText("Car Loan"));
		//ac.click(eleOne).build().perform();
		ac.sendKeys(dr.findElement(By.xpath("//*[@id='Search'][@autocomplete='off']")), "dafgdfgfd").build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}

}
