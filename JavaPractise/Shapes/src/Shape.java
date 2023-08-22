
public class Shape implements Compares { //to implement an interface on a class use the implements keyword
	public static double totalArea = 0.0;
	public static double totalPerimeter = 0.0;
	public double getArea() //creating a getArea method to be overriden by the child classes
	{
		return 0.00;
	}
	public double getPerimeter() //creating a getPerimeter method to be overriden by the child classes
	{
		return 0;
	}
	public boolean equals(Shape s) //creating a equals method to be overriden by the child classes
	{
		return true;
	}
	public void shapesCalculator() 
	{
		
	}
	public String toString() 
	{
		return null;
	}
	public int hashCode() 
	{
		return 0;
	}
	public String getName() 
	{
		return null;
	}
	public String getDimensions() 
	{
		return null;
	}
	public String CompareTo(Shape s1, Shape s2) 
	{
		double firstShape = s1.getArea();
		double secondShape = s2.getArea();
		String shapeOneName = s1.getName();
		String shapeTwoName = s2.getName();
		String shapeOneDimensions = s1.getDimensions();
		String shapeTwoDimensions = s2.getDimensions();
		if (firstShape > secondShape) //comparing the values of each area then returning a string 
		{
			return "The larger shape is " + shapeOneName + ":" + shapeOneDimensions + " and the smaller shape is " + shapeTwoName + ":" + shapeTwoDimensions;
		}
		else if (firstShape < secondShape) 
		{
			return "The larger shape is " + shapeTwoName + ":" + shapeTwoDimensions + " and the smaller shape is " + shapeOneName + ":" + shapeOneDimensions;
		}
		else 
		{
			return "The shapes are the same";
		}
	}
}
