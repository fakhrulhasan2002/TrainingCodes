package Session5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ClassOne {
  @Test
  public void TestOne() {
	  System.out.println("ClassOne - Test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("ClassOne - Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("ClassOne - AfterMethod");
  }

}
