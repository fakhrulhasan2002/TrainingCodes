import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trtdProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("http://ksrtc.in/pages/contact-us.html");
		
		 List<WebElement> src = dr.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td"));
	     for(WebElement e:src){
	    	 System.out.println(e.getText());
	    	 if(e.getText().toString().contains("States"))
	    		 System.out.println("States is present in:"+e.getText());
	     }
	}

}
