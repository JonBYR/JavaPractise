import static java.lang.Math.*; //import all static members of the class math so that the class name isn't required to call thier methods
public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iOb, iOb2; //creation of two integer objects rather than int primative types
		int i;
		iOb = 99; //integer object is assign the number 99
		System.out.println(iOb);
		++iOb; //incremementation of boxed object
		System.out.println(iOb);
		iOb += 10; //iOb object increased
		System.out.println(iOb);
		iOb2 = iOb + (iOb / 3); //iOb object unboxed, value evaluated and the value is reboxed into iOb2
		System.out.println(iOb2);
		i = (int) sqrt(iOb); //static import allows sqrt to be called only by method name
		//above statement will be unboxed and the integer value assigned to the primative int
		System.out.println(i);
	}
//Use of the Integer object will allow for similiar opperations as primative ints via unboxing the int value in iOb and reboxing the new int value
}
