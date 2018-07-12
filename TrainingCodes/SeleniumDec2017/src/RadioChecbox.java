import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioChecbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		

		//Radio Buttons
		/*boolean abc = driver.findElement(By.xpath(".//*[@type='radio'][@value='1']")).isDisplayed();
		if(abc==true){
		    driver.findElement(By.xpath(".//*[@type='radio'][@value='1']")).click();
		}

		Thread.sleep(2000);
		boolean xyz = driver.findElement(By.xpath(".//*[@type='radio'][@value='1']")).isSelected();
		
		if(xyz==true){

			driver.findElement(By.xpath(".//*[@type='radio'][@value='2']")).click();
		}*/

		//Checkbox
		driver.get("http://www.indeed.ca");
		driver.findElement(By.linkText("Sign in")).click();
		
		boolean abc = driver.findElement(By.xpath("//*[@id='signin_remember']")).isDisplayed();
		boolean xyz = driver.findElement(By.xpath("//*[@id='signin_remember']")).isSelected();
		if(abc==true && xyz==true){
	    	driver.findElement(By.xpath("//*[@id='signin_remember']")).click();
	    }
		Thread.sleep(2000);
		boolean abc1 = driver.findElement(By.xpath("//*[@id='signin_remember']")).isDisplayed();
		boolean xyz1 = driver.findElement(By.xpath("//*[@id='signin_remember']")).isSelected();
		if(abc1==true && xyz1==false){
	    	driver.findElement(By.xpath("//*[@id='signin_remember']")).click();
	    }
	
	}
	

}
