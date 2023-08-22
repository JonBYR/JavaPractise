
public class Circle extends Shape {
	private String name = "Circle";
	private int radius;
	public Circle(int r) throws InvalidShapeException
	{
		if (r <= 0) 
		{
			throw new InvalidShapeException("Circle radius cannot be negative");
		}
		else 
		{
			radius = r;
		}
	}
	@Override
	public double getPerimeter() 
	{
		double perimeter = Math.PI * 2 * radius;
		return perimeter;
	}
	@Override
	public double getArea() 
	{
		double area = Math.PI * radius * radius;
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
		return "Circle r= " + radius + "."; 
	}
	@Override
	public int hashCode() 
	{
		return radius;
	}
	@Override
	public String getName() //return the private variable name (encapsulation) 
	{
		return name;
	}
	@Override
	public String getDimensions() 
	{
		String strRadius = Integer.toString(radius); //convert integer to string
		return "r=" + strRadius;
	}
}
