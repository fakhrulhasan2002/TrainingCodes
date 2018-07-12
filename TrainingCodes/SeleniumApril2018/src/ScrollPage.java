import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//scroll
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		//for scroll down
		je.executeScript("window.scroll(0,900)", "");
		//for reverse or scroll up
		je.executeScript("window.scroll(900,0)", "");
	}

}
