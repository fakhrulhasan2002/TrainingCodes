package java.MavenProject.SeleniumMavenDec;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testNGTest {
  @Test
  public void TC001() {
	  System.out.println("Test 1");
  }
  @Test
  public void TC002() {
	  System.out.println("Test 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
