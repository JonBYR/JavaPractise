
public class StaticBlock {
	static double sqr1 = 4.0;
	static double sqr2 = 16.0;
	static { //static block will be executed first in the class before the constructor
		System.out.println("Inside static block");
		sqr1 = Math.sqrt(sqr1);
		sqr2 = Math.sqrt(sqr2);
	}
	StaticBlock(String message) {
		System.out.println(message);
	}
}
