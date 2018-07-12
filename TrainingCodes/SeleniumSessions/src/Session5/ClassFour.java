package Session5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ClassFour {
  @Test
  public void TestF() { 
			  System.out.println("ClassFour - TestF");
  
 }
  @Test
  public void TestG() { 
			  System.out.println("ClassFour - TestG");
  }
  @BeforeMethod
  public void beforeMethod() {
				  System.out.println("ClassFour - Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("ClassFour - After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("ClassFour - Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ClassFour - After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("ClassFour - Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ClassFour - After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("ClassFour - Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("ClassFour - After Suite");
  }

}
