package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNGClassTwo {
  @Test(priority=6, groups="sanity")
  public void TC003() {
	  System.out.println("TC003");
  }
  @Test(priority=2)
  public void TC004() {
	  System.out.println("TC004");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2 - Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("2 - After Method");
  }

}
