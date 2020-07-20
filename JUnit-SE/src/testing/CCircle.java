package testing;
/** class CCircle inherits class shape and must code CalculateArea
 * 
 * @author kobti
 *
 */

public class CCircle extends CShape {
	private int radius = 1;
	
	// overloaded constructor
	public CCircle(int radius)
	{
		shapename = "circle";
		setRadius(radius);
	}
	
	public void setRadius(int radius)
	{
		if (isValidRadius(radius)) this.radius = radius;
	}
	
	private boolean isValidRadius(int r)
	{
		return (r > 0);
	}
	
	// this is a method override of the abstract method in CShape
	public double CalculateArea()
	{
		return radius*radius*Math.PI;
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}
}
