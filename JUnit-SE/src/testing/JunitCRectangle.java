package testing; 

import org.junit.Test; 
import junit.framework.TestCase;

public class JunitCRectangle {

	@Test
	public void testvalue10and20() {
		CRectangle test=new CRectangle(10, 20);
		double result=test.CalculateArea();
		TestCase.assertEquals(200.0, result);
	}
	@Test
	public void testvalue10and12() {
		CRectangle test=new CRectangle(10, 12);
		double result=test.CalculateArea();
		TestCase.assertEquals(120.0, result);
	}
	@Test
	public void testvalue1and2() {
		CRectangle test=new CRectangle(1, 2);
		double result=test.CalculateArea();
		TestCase.assertEquals(2.0, result);
	}
}
