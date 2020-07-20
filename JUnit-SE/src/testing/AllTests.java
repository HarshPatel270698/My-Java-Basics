package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitCCircle.class, JunitCRectangle.class, JunitCShape.class, JunitCSquare.class,
		JunitCTriangle.class })
public class AllTests {

}
