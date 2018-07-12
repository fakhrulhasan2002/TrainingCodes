package Session1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SessionFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.facebook.com");
	    
	    //ID
	    /*driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("test@gmail.com");*/
	    //name
	    
	    //classname
	   /* List<WebElement> var = driver.findElements(By.className("inputtext"));
	    //System.out.println("Size of List:"+var.size());
	    var.get(0).sendKeys("test@gmail.com");
	    var.get(1).sendKeys("dfjhkdsjf");
	    driver.findElement(By.id("loginbutton")).click();*/
	    
	    /*for(int i=0;i<var.size();i++){
	    	System.out.println("Index:"+i+":"+var.get(i).getText());
	       }*/
	    //linktext
	    //driver.findElement(By.linkText("Forgotten account?")).click();
	    //partiallinktext
	    //driver.findElement(By.linkText("Forgotten ")).click();
	    //xpath
	    //https://www.guru99.com/xpath-selenium.html
	    //tagname[@attribute="value"]]
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aewroewru");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    
	    //CSS -- Cascaded style sheet
	    
	    //javascriptExecutor
	    /*JavascriptExecutor jre =  (JavascriptExecutor)driver;
		jre.executeScript("scroll(0,500)",""); */ //"window.scrollBy(0,500)", "" // 
	}

}
