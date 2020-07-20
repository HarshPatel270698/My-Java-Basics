package testing;
/** Class CShape
 * 
 * @author kobti
 *
 *this is class shape which is abstract
 *a shape is a superclass allowing inheritance of specific shapes
 *every shape has a unique positive id and ability to have its area
 *calculated using the abstract function CalculateArea()
 *
 */

public abstract class CShape {

		private static int counter = 0;	// internal counter
		private int id;					// unique id for this shape instance
		protected String shapename;
		
		/** default construtor */
		public CShape()
		{
			id = ++counter;
		}
		
		/** getid access method for id */
		public int getid()
		{
			return id;
		}

		/** abstract method - must be implemented by derived classes */
		abstract protected double CalculateArea();
		

}
