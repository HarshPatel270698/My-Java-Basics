package testing;

import static org.junit.Assert.*;  
import org.junit.Test;

public class JunitCShape {
		@Test
		public void test()
			{
			CShape testr=new CRectangle(10,2);
			CShape testc=new CCircle(10);
			String result=testr.toString();
			String result1=testc.toString();
			assertEquals("this is a rectangle with area "+20.0,result);
			assertEquals("this is a circle with area " +314.1592653589793,result1);
			}
		@Test
		public void testvalues0and0()
			{
			CShape testr=new CRectangle(40,0);
			CShape testc=new CCircle(0);
			String result=testr.toString();
			String result1=testc.toString();
			assertEquals("this is a rectangle with area "+0.0,result);
			assertEquals("this is a circle with area " +0.0,result1);
			}
}
