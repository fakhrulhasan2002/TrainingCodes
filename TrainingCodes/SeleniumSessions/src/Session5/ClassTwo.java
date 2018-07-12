package Session5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTwo {
  @Test
  public void TestB() {
	  System.out.println("ClassTwo - TestB");
  }
  @Test
  public void TestC() {
	  System.out.println("ClassTwo - TestC");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("ClassTwo - Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("ClassTwo - After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("ClassTwo - Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ClassTwo - After Class");
  }

}
