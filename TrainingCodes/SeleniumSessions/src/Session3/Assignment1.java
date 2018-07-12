package Session3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.indianrail.gov.in/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.className("link-main-menu"));
		int a=list.size();
		
		for(int i=0;i<a;i++){
			System.out.println("Item:"+i+":"+list.get(i).getText());
		}
		
		
	}

}
