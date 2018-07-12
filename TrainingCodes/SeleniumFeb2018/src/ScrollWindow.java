import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.w3schools.com/cssref/css_selectors.asp");
		
		JavascriptExecutor je = (JavascriptExecutor) dr;
		je.executeScript("window.scroll(0,900)","");
		je.executeScript("arguments[0].click();", dr.findElement(By.xpath("//a[@href='sel_id.asp']")));
		//je.executeScript("window.scroll(0,900)","");
		
	}

}
