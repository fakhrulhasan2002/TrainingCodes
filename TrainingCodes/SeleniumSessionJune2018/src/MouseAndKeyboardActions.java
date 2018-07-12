import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://www.hdfcbank.com";
		WebDriver local;
		local=TestBase.init(url);
		
		Actions ac = new Actions(local);
		//WebElement toElement=local.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]"));
		/*ac.moveToElement(toElement).build().perform();
		ac.click(local.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[2]/div[2]/div/ul/li[3]/a"))).build().perform();*/
		WebElement toElementSearch=local.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input"));
		
		ac.sendKeys(toElementSearch, Keys.SHIFT).build().perform();
		ac.sendKeys("asdhhfsid").build().perform();
		ac.sendKeys(Keys.SHIFT).build().perform();
		ac.sendKeys("cnviahva").build().perform();
		ac.sendKeys(Keys.RETURN).build().perform();
		
	}

}
