package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassOne.class, ClassZero.class })
public class SanityTest {

	public static void SuiteLevel(){
		System.out.println("Suite");
	}
}
