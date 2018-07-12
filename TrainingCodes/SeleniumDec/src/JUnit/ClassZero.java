package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClassZero {

	@BeforeClass //annotaion
	public static void setUpBeforeClass() throws Exception {
		System.out.println("2- Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("2- After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("2- Setup Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("2- Setup After");
	}

	@Test
	public void TC0001() {
		//fail("Not yet implemented");
		System.out.println("2- Test 1");
	}
	@Test
	public void TC0002() {
		//fail("Not yet implemented");
		System.out.println("2- Test 2");
	}
	@Test
	public void TC00100() {
		//fail("Not yet implemented");
		System.out.println("2- Test 3");
	}

}
