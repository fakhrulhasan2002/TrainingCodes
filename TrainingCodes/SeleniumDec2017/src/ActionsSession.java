import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.hdfcbank.com");
	   /* boolean b = dr.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).isDisplayed();
	    if(b==true)
	    	dr.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).click();
	    */
		List<WebElement> abc = dr.findElements(By.xpath("//*[@class='menutext']"));
	    int i=0;
	    for(WebElement w:abc){
	    	System.out.println("Index"+"["+i+"]"+w.getText());
	    	i++;
	    }
	    //abc.get(4).click();
	    //index 4
	    Thread.sleep(5000);
	   Actions ac = new Actions(dr);
	   //ac.click(abc.get(4)).build().perform();
	  //ac.moveToElement(abc.get(4)).build().perform();
	  //ac.click(dr.findElement(By.linkText("Gold Loan"))).build().perform();
	  //ac.dragAndDrop(dr.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/img")),dr.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input"))).build().perform();
	   //WebElement search = dr.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input"));
	   
	   /*ac.sendKeys(Keys.SHIFT).build().perform();
	   ac.sendKeys(search, "Gold Loan").build().perform();
	   ac.sendKeys(Keys.RETURN).build().perform();*/
	   //ac.click(dr.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"))).build().perform();
	   WebElement w=abc.get(4);
	   Point p=w.getLocation();
	   System.out.println("Value of X:"+p.getX());
	   System.out.println("Value of Y:"+p.getY());
	   
	   ac.moveByOffset(p.getX()+500, p.getY()).build().perform();
	  	}

}
