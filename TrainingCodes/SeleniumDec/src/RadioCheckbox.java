import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		
		//radiobutton
		/*
		  driver.get("http://www.facebook.com");
		
		  boolean b = driver.findElement(By.xpath("//*[@value='1'][@type='radio']")).isSelected();
	      if(b!=true){
	    	  driver.findElement(By.xpath("//*[@value='1'][@type='radio']")).click();
	      }
		  b = driver.findElement(By.xpath("//*[@value='1'][@type='radio']")).isSelected();
	      Thread.sleep(2000);
		  if(b==true){
	    	  driver.findElement(By.xpath("//*[@value='2'][@type='radio']")).click();  
	      }
	      b = driver.findElement(By.xpath("//*[@value='2'][@type='radio']")).isSelected();
		  System.out.println(b);*/
		  
		//checkbox
		
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		//je.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@value='Google Search'][@type='button']")));
		Thread.sleep(2000);
		je.executeScript("window.scroll(0,750)", "");
		
		//boolean b = driver.findElement(By.id("profession-0")).isSelected();
		//if(b!=true){
		if(!driver.findElement(By.id("profession-0")).isSelected())
			driver.findElement(By.id("profession-0")).click();
		Thread.sleep(2000);
		if(!driver.findElement(By.id("profession-1")).isSelected())
			driver.findElement(By.id("profession-1")).click();
			Thread.sleep(2000);
		if(!driver.findElement(By.id("profession-0")).isSelected())	
			driver.findElement(By.id("profession-0")).click();
		//}
		
	}

}
