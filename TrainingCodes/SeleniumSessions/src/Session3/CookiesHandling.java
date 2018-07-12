package Session3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesHandling {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<Cookie> cook = driver.manage().getCookies();
		for(Cookie s:cook){
			System.out.println(s.getName());
		}
		//driver.manage().deleteCookieNamed("");
		//driver.manage().deleteAllCookies();
		//driver.manage().addCookie(null);
		
	}

}
