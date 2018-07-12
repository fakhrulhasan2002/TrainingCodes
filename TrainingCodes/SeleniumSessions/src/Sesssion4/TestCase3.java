package Sesssion4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("TestCase 3 Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("TestCase 3 After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("TestCase 3 Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TestCase 3 After");
	}

	@Test
	public void test() {
		System.out.println("TestCase 3");
	}

}
