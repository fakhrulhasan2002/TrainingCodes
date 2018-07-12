package Session3;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.ca");
		
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']")).click();
		
		//boolean checkBoxDisplay = driver.findElement(By.name("rememberMe")).isDisplayed();
		boolean checkboxSelected = driver.findElement(By.name("rememberMe")).isSelected();
		//boolean checkboxEnable = driver.findElement(By.name("rememberMe")).isEnabled();
		
		if(!checkboxSelected){
			driver.findElement(By.name("rememberMe")).click();	
		}
		
	}

}
