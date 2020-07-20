package testing;

import org.junit.Test; 
import junit.framework.TestCase;

public class JunitCCircle {

		@Test
		public void testvalue1()
		{
			CCircle test=new CCircle(1);
			double result=test.CalculateArea();
			TestCase.assertEquals(3.141592653589793,result);
		}
		@Test
		public void testvalue9() 
		{
			CCircle test=new CCircle(9);
			double result=test.CalculateArea();
			TestCase.assertEquals(254.46900494077323,result);
		}
		@Test
		public void testvalue10()
		{
			CCircle test=new CCircle(10);
			double result=test.CalculateArea();
			TestCase.assertEquals(314.1592653589793,result);
		}

		@Test
		public void testvalue0() 
		{
			CCircle test=new CCircle(0);
			double result=test.CalculateArea();
			TestCase.assertEquals(0.0,result);
		}
}
