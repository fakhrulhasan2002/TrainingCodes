import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckboxSesion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scroll(0,900)", "");
		/*Thread.sleep(2000);
		jr.executeScript("window.scroll(900,0)", "");*/
		boolean b = driver.findElement(By.xpath("//*[@value='Male']")).isSelected();
        System.out.println("1:"+b);
        if(b==true){
        	System.out.println("Already selected");
        }else{
        	driver.findElement(By.xpath("//*[@value='Male']")).click();
        }
        
        b = driver.findElement(By.xpath("//*[@value='Male']")).isSelected();
        System.out.println("2:"+b);
        
        if(b==true){
        	System.out.println("Male radio button selected. Select Female");
        	driver.findElement(By.xpath("//*[@value='Female']")).click();
        }else{
        	driver.findElement(By.xpath("//*[@value='Male']")).click();
        	System.out.println("Female radio button already selected");
        }
        b = driver.findElement(By.xpath("//*[@value='Female']")).isSelected();
        System.out.println("3:"+b);
        
        
        ///checkbox
        boolean c=driver.findElement(By.xpath("//*[@value='Manual Tester']")).isSelected();
	    System.out.println("c1:"+c);
	    if(c==false){
	    	driver.findElement(By.xpath("//*[@value='Manual Tester']")).click();
	    }
	    c=driver.findElement(By.xpath("//*[@value='Automation Tester']")).isSelected();
	    System.out.println("c2:"+c);
	    if(c==false){
	    	driver.findElement(By.xpath("//*[@value='Automation Tester']")).click();
	    }
	    c=driver.findElement(By.xpath("//*[@value='Manual Tester']")).isSelected();
	    System.out.println("c1 After:"+c);
	    c=driver.findElement(By.xpath("//*[@value='Automation Tester']")).isSelected();
	    System.out.println("c2:After"+c);
	}

}
