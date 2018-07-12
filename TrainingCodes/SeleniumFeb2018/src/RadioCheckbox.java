import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor je = (JavascriptExecutor) dr;
		je.executeScript("window.scroll(0,750)", "");
		
		//Radio Button
		/*boolean res = dr.findElement(By.xpath("//*[@value='Male']")).isSelected();
		if(res!=true)
		   dr.findElement(By.xpath("//*[@value='Male']")).click();
		
		res=dr.findElement(By.xpath("//*[@value='Male']")).isSelected();
		if(res==true)
		   dr.findElement(By.xpath("//*[@value='Female']")).click();*/
	
		//Checkbox
		boolean res = dr.findElement(By.xpath("//*[@value='Manual Tester']")).isSelected();
		if(res!=true)
		   dr.findElement(By.xpath("//*[@value='Manual Tester']")).click();
		
		res=dr.findElement(By.xpath("//*[@value='Manual Tester']")).isSelected();
		if(res==true){
		   dr.findElement(By.xpath("//*[@value='Manual Tester']")).click();
		   dr.findElement(By.xpath("//*[@value='Automation Tester']")).click();
		}
	}

}
