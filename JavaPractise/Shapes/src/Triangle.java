import java.util.Arrays; //import the arrays module into java

public class Triangle extends Shape {
	private String name = "Triangle";
	private int s1; //private variables for encapsulation
	private int s2;
	private int s3;
	public Triangle(int first, int second, int third) throws InvalidShapeException //as this method returns custom exceptions we need to include the throws customException in the constructor
	{
		int sumOfFirstAndSecond = first + second;
		int sumOfFirstAndThird = first + third;
		int sumOfSecondAndThird = second + third;
		if ((first <= 0) || (second <= 0) || (third <= 0)) //checking if the sides are 0 or negative
		{
			throw new InvalidShapeException("Triangle cannot have negative sides");
		}
		if ((third > sumOfFirstAndSecond) || (second > sumOfFirstAndThird) || (first > sumOfSecondAndThird)) //checking if there is a longest side
		{
			throw new InvalidShapeException("Triangle has no hypotenuse");
		}
		else 
		{
			s1 = first;
			s2 = second;
			s3 = third; //if neither error condition is thrown then we create the triangle
		}
	}
	@Override
	public double getPerimeter() //overriding the shape getPerimeter method
	{
		double perimeter = s1 + s2 + s3;
		return perimeter;
	}
	@Override
	public double getArea() //overiding the shape getArea method 
	{
		double perimeter = getPerimeter(); //as we need the perimeter for the area equation we assign a double to store the value from the triangle method
		double area = Math.sqrt(perimeter * (perimeter - s1) * (perimeter - s2) * (perimeter - s3));
		return area;
	}
	@Override
	public boolean equals(Shape s) 
	{
		double perimeter =  getPerimeter();
		double area = getArea();
		if ((perimeter == s.getPerimeter()) && area == s.getArea()) //checking if the perimeter and area is the same for both shapes
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
		int[] sides = new int[] {s1, s2, s3}; //implementing an array for the sides
		Arrays.sort(sides); //sorting the sides array in ascending order
		return "Triangle " + sides[0] + " " + sides[1] + " " + sides[2] + ".";
	}
	@Override
	public int hashCode() 
	{
		return s1 * s2 * s3;
	}
	@Override
	public String getName() //return the private variable name (encapsulation) 
	{
		return name;
	}
	@Override
	public String getDimensions() 
	{
		String strFirst = Integer.toString(s1); //convert integer to string
		String strSecond = Integer.toString(s2);
		String strThird = Integer.toString(s3);
		return strFirst + ", " + strSecond + ", " + strThird;
	}
}
	
