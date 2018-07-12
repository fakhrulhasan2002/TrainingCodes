import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.icicibank.com");
		WebElement a = driver.findElement(By.linkText("Apply Online"));
		WebElement b = driver.findElement(By.xpath("//input[@id='Search'][@autocomplete='off']"));
		if(driver.findElement(By.xpath("//*[@id='push-modal-close']")).isDisplayed())
			driver.findElement(By.xpath("//*[@id='push-modal-close']")).click();
		Actions ac = new Actions(driver);
		//ac.moveToElement(a).build().perform();
		Point p = b.getLocation(); //get the point of the element
		p.getX(); //get X offset of point for b
		p.getY(); //get Y offset of point for b
		ac.sendKeys(b, "Apply now").build().perform();
		ac.sendKeys(b, Keys.RETURN).build().perform();
	
	
	
		//ac.dragAndDrop(a,b).build().perform();
		
		//ac.keyUp(Keys.ENTER).build().perform();;
	}

}
