package Session3;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		boolean femaleRadioButton = driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).isSelected();
		boolean maleRadioButton = driver.findElement(By.xpath("//*[@type='radio'][@value='2']")).isSelected();
		
		if(!femaleRadioButton){
			driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).click();	
			System.out.println("Male Selected");
		}
		Thread.sleep(3000);
		
		if(!maleRadioButton){
			driver.findElement(By.xpath("//*[@type='radio'][@value='2']")).click();
			System.out.println("Male Selected 1");
		}
		
		
		
	}

}
