package Session5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClassThree {
  @Test
  public void TestD() { 
		  System.out.println("ClassThree - TestD");
  }
  @Test
  public void TestE() { 
		  System.out.println("ClassThree - TestE");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("ClassThree - Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("ClassThree - After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("ClassThree - BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ClassThree - AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("ClassThree - Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ClassThree - After Test");
  }

}
