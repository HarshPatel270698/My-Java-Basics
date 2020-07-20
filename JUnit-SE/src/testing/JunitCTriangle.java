package testing;

import org.junit.Test; 
import junit.framework.TestCase;

public class JunitCTriangle {

	@Test
	public void testvalue6and6()
	{
		CTriangle test=new CTriangle(6,6);
		double result=test.CalculateArea();
		TestCase.assertEquals(18.0, result);		
	}
	@Test
	public void testvalue3and3()
	{
		CTriangle test=new CTriangle(3,3);
		double result=test.CalculateArea();
		TestCase.assertEquals(4.0, result);		
	}
	@Test
	public void testvalue6and0()
	{
		CTriangle test=new CTriangle(6,0);
		double result=test.CalculateArea();
		TestCase.assertEquals(3.0, result);		
	}
	@Test
	public void testvalue5and2()
	{
		CTriangle test=new CTriangle(5,2);
		double result=test.CalculateArea();
		TestCase.assertEquals(5.0, result);		
	}
}
