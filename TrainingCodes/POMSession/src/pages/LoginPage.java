package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	

	//driver.findElement(By.id("pass")).sendKeys("dgfdgfdg");
	
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("pass");
	By forgotaccount= By.linkText("Forgot account?");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	private WebElement username(){
		return driver.findElement(username);
	}
	
	private WebElement password(){
		return driver.findElement(password);
	}
	private WebElement forgotAccount(){
		return driver.findElement(forgotaccount);
	}
	//login method
	public void loginToPage(String usr, String pass){
		username().sendKeys(usr);
		password().sendKeys(pass);
	}
	public void getforgotAccount(){
		forgotAccount().click();
	}
	
	
	

}
