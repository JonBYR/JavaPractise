
public class Rectangle extends Shape {
	private String name = "Rectangle";
	private int width;
	private int height;
	public Rectangle(int l1, int l2) throws InvalidShapeException 
	{
		if (l1 > l2) 
		{
			width = l2;
			height = l1;
		}
		else if (l2 > l1) 
		{
			width = l1;
			height = l2;
		}
		else if (l2 == l1)
		{
			throw new InvalidShapeException("Rectangle cannot have the same width and height");
		}
		else if ((l1 <= 0) || (l2 <= 0)) 
		{
			throw new InvalidShapeException("Rectangle cannot be negative");
		}
	}
	@Override
	public double getPerimeter() 
	{
		double perimeter = 2 * (height + width);
		return perimeter;
	}
	@Override
	public double getArea() 
	{
		double area = width * height;
		return area;
	}
	@Override
	public boolean equals(Shape s) 
	{
		double perimeter =  getPerimeter();
		double area = getArea();
		if ((perimeter == s.getPerimeter()) && area == s.getArea()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	@Override
	public void shapesCalculator() //overriden method will add the triangle's perimeter and area to the static variable in shape
	{
		totalPerimeter += getPerimeter();
		totalArea += getArea();
	}
	@Override
	public String toString() 
	{
		return "Rectangle " + width + "X" + height + ".";
	}
	@Override
	public int hashCode() 
	{
		return width * height;
	}
	@Override
	public String getName() //return the private variable name (encapsulation) 
	{
		return name;
	}
	@Override
	public String getDimensions() 
	{
		String strWidth = Integer.toString(width); //convert integer to string
		String strHeight = Integer.toString(height);
		return strWidth + "X" + strHeight;
	}
}
