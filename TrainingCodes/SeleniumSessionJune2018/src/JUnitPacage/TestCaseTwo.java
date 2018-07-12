/**
 * 
 */
package JUnitPacage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Ronak Shah
 *
 */
public class TestCaseTwo {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	//@Ignore("Ignored")
	@Test(timeout=1000)
	public void testOne() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Test One");
	}

	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
	@Test
	public void testThree() {
		System.out.println("Test Three");
	}
}
