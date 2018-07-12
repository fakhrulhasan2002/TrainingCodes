package JUnitSession;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SessionOne.class, SessionThree.class, SessionTwo.class })
public class TestSuiteRel1 {

}
