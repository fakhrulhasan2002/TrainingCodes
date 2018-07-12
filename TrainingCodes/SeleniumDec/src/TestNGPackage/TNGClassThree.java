package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TNGClassThree {
  @Test(priority=4,groups="sanity")
  public void TC005() {
	 System.out.println("TC005");
  }
  @Test(priority=3)
  public void TC006() {
	  System.out.println("TC006");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("3 - Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("3 - After Class");
  }

}
