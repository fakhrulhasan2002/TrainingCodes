import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="http://www.instagram.com";
		WebDriver local;
		local=TestBase.init(url);
		
		local.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		local.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
		
		Set<String> winlist = local.getWindowHandles();
		
		/*for(String s:winlist) {
			System.out.println(s);
		}*/
		Iterator<String> itr=winlist.iterator();
		 String pwin = itr.next();
		 String awin=itr.next();
		 String apwin=itr.next();
		
		local.switchTo().window(awin);
		local.findElement(By.xpath("//*[@id='fcxH9b']/div[1]/c-wiz[2]/div/div/div/div[3]/div/a")).click();
		local.switchTo().window(apwin);
		local.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[6]/a")).click();
		
		local.switchTo().window(pwin);
		local.findElement(By.xpath("//*[@name='emailOrPhone']")).sendKeys("dafhaifhaefawufaiwfu");
	}

}
