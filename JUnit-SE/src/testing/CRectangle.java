package testing;
/** Class CRectangle implements class rectangle shape which is a 
 * derived class from CShape. We must implement its CalculateArea()
 * 
 * @author kobti
 *
 */


public class CRectangle extends CShape
{
	private int length = 1;	// length must be positive
	private int width = 1;	// width must be positive

	public CRectangle(int length, int width)
	{	
		shapename = "rectangle";
		setLength(length);
		setWidth(width);
	}
	
	public int setLength(int length)
	{
		//this.length = (length) > 0? length: this.length;
		if (isValidPositive(length)) this.length = length;
		return length;
	}
	
	public int setWidth(int width)
	{
		if (isValidPositive(width)) this.width = width;
		return width;
	}
	
	// todo: code the get methods
	
	// internal method (utility method) to store the rule for a valid side
	private boolean isValidPositive(int n)
	{
		return (n>0);
	}
	
	@Override
	protected double CalculateArea() {
		
		return width * length;
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}

}
