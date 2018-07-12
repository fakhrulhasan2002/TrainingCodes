import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CookeiCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr= new FirefoxDriver();
		dr.get("http://www.facebook.com");
		Set<Cookie> ck = dr.manage().getCookies();
		for (Cookie s:ck)
			System.out.println(s);
		
		FirefoxProfile pf = new FirefoxProfile();
		pf.setAcceptUntrustedCertificates(true);
		
		WebDriver drive = new FirefoxDriver(pf);
		
	}

}
