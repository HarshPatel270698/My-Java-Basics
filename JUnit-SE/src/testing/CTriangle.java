package testing;


public class CTriangle extends CShape{
	private int height= 2;
	private int base=2;

	public CTriangle(int base,int height)
	{	
		shapename = "Triangle";
		setbase(base);
		setheight(height);
	}
	
	public int setbase(int base)
	{
		if (isValidPositive(base)) this.base = base;
		return base;
	}
	
	public int setheight(int height)
	{
		if (isValidPositive(height)) this.height = height;
		return height;
	}
	
	private boolean isValidPositive(int n)
	{
		return (n>0);
	}
	
	@Override
	protected double CalculateArea() {
		return (base*height)/2;
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}


}
