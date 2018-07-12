import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xpath
		
		//CSS
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("adsfaf@gmail.com");
		driver.findElement(By.cssSelector("input[type='password'][data-testid='royal_pass']")).sendKeys("zvdfadv");
		driver.findElement(By.cssSelector("#loginbutton")).click();

	}

}
