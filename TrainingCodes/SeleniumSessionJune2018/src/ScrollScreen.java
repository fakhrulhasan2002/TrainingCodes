import org.openqa.selenium.JavascriptExecutor;

public class ScrollScreen extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://toolsqa.com/automation-practice-form/";
		init(url);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//Scroll Down
		je.executeScript("window.scrollTo(0,800)", "");
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,-800)", "");
	}

}
