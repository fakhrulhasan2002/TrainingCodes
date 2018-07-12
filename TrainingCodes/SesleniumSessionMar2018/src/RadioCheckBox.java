import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
		boolean Fstatus = dr.findElement(By.xpath("//input[@type='radio'] [@value='1']")).isSelected();
		System.out.println("Before click: "+Fstatus);
		if(Fstatus==false){
		  dr.findElement(By.xpath("//input[@type='radio'] [@value='1']")).click();
		}
		Fstatus = dr.findElement(By.xpath("//input[@type='radio'] [@value='1']")).isSelected();
		System.out.println("After Click: "+Fstatus);
		
		
	    if(Fstatus==true){
	    	dr.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
	    }
	    boolean Mstatus = dr.findElement(By.xpath("//input[@type='radio'][@value='2']")).isSelected();
	    Fstatus = dr.findElement(By.xpath("//input[@type='radio'] [@value='1']")).isSelected();
	    System.out.println("M:"+Mstatus);
	    System.out.println("F:"+Fstatus);
	    
	    ////Check box
	    
	}

}
