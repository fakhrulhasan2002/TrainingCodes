import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//ID
		/*driver.findElement(By.id("email")).sendKeys("sadfadsf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hgfyfhk");
		driver.findElement(By.id("loginbutton")).click();*/
		
		//LinkText
		//driver.findElement(By.linkText("Forgot account?")).click();
		//Partial Link Text
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//tagname
		/*List<WebElement> str = driver.findElements(By.xpath("//*"));
		for(WebElement w:str){
			System.out.println(w.getTagName());
		}*/
		//ClassName
		List<WebElement> var = driver.findElements(By.className("inputtext"));
		int a = var.size();
		System.out.println(a);
		var.get(0).sendKeys("afdagd@gmail.com");
		var.get(1).sendKeys("hddfhfh");
		driver.findElement(By.id("loginbutton")).click();
		
		
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		/*File file= new File("src");
		File[] s = file.listFiles();
		for(File s1:s)
		   System.out.println(s1.getName());*/
	}

}
