package JUnitPacage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCaseFor.class, TestCaseOne.class, TestCaseThree.class, TestCaseTwo.class })
public class SuiteFinal {

}
