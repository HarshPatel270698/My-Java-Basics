package testing;

import org.junit.Test; 
import junit.framework.TestCase;

public class JunitCSquare {

	@Test
	public void testvalue10()
	{		
		CSquare tests = new CSquare(10);
		CRectangle testr = (CRectangle) tests;
		double result=testr.CalculateArea();
		TestCase.assertEquals(100.0, result);
	}
	@Test
	public void testvalue1()
	{		
		CSquare tests = new CSquare(1);
		CRectangle testr = (CRectangle) tests;
		double result=testr.CalculateArea();
		TestCase.assertEquals(1.0, result);
	}
	@Test
	public void testvalue100()
	{		
		CSquare tests = new CSquare(100);
		CRectangle testr = (CRectangle) tests;
		double result=testr.CalculateArea();
		TestCase.assertEquals(10000.0, result);
	}
}
