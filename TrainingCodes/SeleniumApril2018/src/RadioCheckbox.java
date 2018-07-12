import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		/*driver.get("http://www.facebook.com");
		
		boolean check = driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).isSelected();
	    System.out.println("1:"+check);
	    Thread.sleep(2000);
		if(check==false){
	    	driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).click();
	    }
		check = driver.findElement(By.xpath("//*[@type='radio'][@value='1']")).isSelected();
		System.out.println("2:"+check);
		Thread.sleep(2000);
		if(check==true){
		 driver.findElement(By.xpath("//*[@type='radio'][@value='2']")).click();
		}
		check = driver.findElement(By.xpath("//*[@type='radio'][@value='2']")).isSelected();
	    System.out.println("3:"+check);*/
	
		//checkbox
		driver.get("http://toolsqa.com/automation-practice-form/");
		//scroll
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("window.scroll(0,900)", "");
		//je.executeScript("window.scroll(900,0)", "");
		boolean b = driver.findElement(By.xpath("//input[@value='Manual Tester']")).isSelected();
	    System.out.println("1:"+b);
		if(b==false){
	    	driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
	    }
		//b = driver.findElement(By.xpath("//input[@value='Manual Tester']")).isSelected();
		System.out.println("2:"+b);
		
	    boolean c = driver.findElement(By.xpath("//input[@value='Automation Tester']")).isSelected();
		if(c==false){
			driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		}
		c=driver.findElement(By.xpath("//input[@value='Automation Tester']")).isSelected();
	    System.out.println("3:"+c);
	}

}
