package JunitPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Session3.class , FacebookTest.class, Session1.class})
public class RegressionTest {

}
