import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlingAndScrollSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		
        dr.get("https://www.instagram.com");
		
        JavascriptExecutor jve = (JavascriptExecutor)dr;
		jve.executeScript("window.scroll(0,600)", "");
		
		dr.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		dr.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
		//Hanlde multiple window
		
		Set<String> abc = dr.getWindowHandles();
		System.out.println(abc);
		Iterator<String> itr=abc.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		String win3 = itr.next();
		//String win4 = itr.next();
		System.out.println("Win1:"+win1);
		System.out.println("Win1:"+win2);
		System.out.println("Win1:"+win3);
		//System.out.println("Win1:"+win4);
		//itune page
		
		dr.switchTo().window(win2);
		dr.findElement(By.linkText("Music")).click();
		
		//google play
		dr.switchTo().window(win3);
		dr.findElement(By.xpath(".//*[@id='gbqfq']")).click();
		
		dr.switchTo().window(win1);
		dr.navigate().refresh();
	}

}
