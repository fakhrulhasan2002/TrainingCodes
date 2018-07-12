import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownRadioCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*driver.get("http://newtours.demoaut.com/mercuryregister.php");
		WebElement a = driver.findElement(By.name("country"));
		
		Select sel= new Select(driver.findElement(By.name("country")));
	    sel.selectByIndex(0);
	    Thread.sleep(2000);
	    sel.selectByValue("11");
	    Thread.sleep(2000);
	    sel.selectByVisibleText("PORTUGAL");*/
		/*driver.get("http://www.facebook.com");
		boolean s = driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).isSelected();
		if(s==false){
			driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).click();
		}
		s=driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).isSelected();
		if(s==true){
			driver.findElement(By.xpath("//*[@type='radio'][@value='2']")).click();
		}*/
		driver.get("https://www.indeed.ca");
		driver.findElement(By.linkText("Sign in")).click();
		boolean s = driver.findElement(By.xpath("//*[@ type='checkbox']")).isSelected();
		if(s==true){
			driver.findElement(By.xpath("//*[@ type='checkbox']")).click();//uncheck
		}
		Thread.sleep(2000);
		s= driver.findElement(By.xpath("//*[@ type='checkbox']")).isSelected();
		if(s==false){
			driver.findElement(By.xpath("//*[@ type='checkbox']")).click();
		}
		
		driver.close();
	}

}
