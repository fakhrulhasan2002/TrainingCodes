package Session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CertificateHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);;
		
		WebDriver driver = new FirefoxDriver(prof);

	}

}
