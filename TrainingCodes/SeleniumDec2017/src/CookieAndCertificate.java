import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CookieAndCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cookies
		//WebDriver dr=new FirefoxDriver();
		//dr.manage().addCookie(arg0);
		
		//Certificate
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		
		WebDriver driver = new FirefoxDriver(prof);
	}

}
