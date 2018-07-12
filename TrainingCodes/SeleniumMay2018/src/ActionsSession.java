import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.ca");
		/*Dimension d = new Dimension(10,20);
		driver.manage().window().setSize(d);*/
		
		
		WebElement toElement = driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
	    Point p = toElement.getLocation();
	    System.out.println(p.getX());
	    System.out.println(p.getY());
		
		Actions ac = new Actions(driver);
		ac.moveByOffset(p.getX(), p.getY()).build().perform();
		//ac.moveToElement(toElement).build().perform();
		WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		ac.click(searchbox).build().perform();
		//ac.clickAndHold(toElement).build().perform();
		//ac.dragAndDrop(toElement, searchbox).build().perform();
		//ac.release(searchbox).build().perform();
		ac.sendKeys(searchbox, Keys.SHIFT).build().perform();
		ac.sendKeys("Book ").build().perform();
		ac.sendKeys(Keys.SHIFT).build().perform();
		ac.sendKeys("Selenium").build().perform();
		ac.sendKeys(searchbox, Keys.ENTER).build().perform();
		
	}

}
