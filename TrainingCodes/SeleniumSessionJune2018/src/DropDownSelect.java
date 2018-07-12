import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	String url="http://newtours.demoaut.com/mercuryregister.php";
	init(url);
	WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
	Select sl=new Select(ele);
	Thread.sleep(2000);
	sl.selectByIndex(47);
	Thread.sleep(2000);
	sl.selectByValue("199");
	Thread.sleep(2000);
	sl.selectByVisibleText("YUGOSLAVIA");
	}

}
