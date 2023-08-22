
public class ShapeMain {

	public static void main(String[] args) throws InvalidShapeException { //since the objects can throw a custom exception we need to reference this in the main argument
		Triangle firstTriangle = new Triangle(2,2,3); //creating a new triangle object
		Rectangle firstRectangle = new Rectangle(3,4); //creating a new rectangle object
		Circle firstCircle = new Circle(5); //creating a new circle object
		Triangle secondTriangle = new Triangle(3,2,2); 
		Rectangle secondRectangle = new Rectangle(1,2);
		Circle secondCircle = new Circle(6);
		Shape blankShape = new Shape(); //since we cannot call the CompareTo method as it is static I have to create an object
		System.out.println(firstTriangle.getArea()); //getting the overriden triangle area method
		System.out.println(firstRectangle.getArea()); //getting the overriden rectangle area method
		System.out.println(firstCircle.getArea()); //getting the overriden circle area method
		System.out.println(firstTriangle.getPerimeter()); //getting the overriden triangle perimeter method
		System.out.println(firstRectangle.getPerimeter()); //getting the overriden rectangle perimeter method
		System.out.println(firstCircle.getPerimeter()); //getting the overriden circle perimeter method
		System.out.println(firstTriangle.equals(secondTriangle)); //getting the overriden triangle equals method
		System.out.println(firstRectangle.equals(secondRectangle)); //getting the overriden rectangle equals method
		System.out.println(firstCircle.equals(secondCircle)); //getting the overriden cicle equals method
		firstTriangle.shapesCalculator();
		firstRectangle.shapesCalculator();
		firstCircle.shapesCalculator(); //calling the individual shapeCalculator method on each shape
		System.out.println(Shape.totalPerimeter); //as each shape has added to the total perimeter and area variables in the parent shape class, the totals will be printed
		System.out.println(Shape.totalArea);
		System.out.println(firstTriangle.toString()); //prints the individual toString methods for each shape object
		System.out.println(firstRectangle.toString());
		System.out.println(firstCircle.toString());
		System.out.println(firstTriangle.hashCode());
		System.out.println(firstRectangle.hashCode()); //prints to individual hashCode values for each object
		System.out.println(firstCircle.hashCode());
		System.out.println(blankShape.CompareTo(firstTriangle, firstCircle));
	}

}
