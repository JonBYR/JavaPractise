
public class BoundedGenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFns<Integer> iOb = new NumberFns<Integer>(6);
		NumberFns<Double> dOb = new NumberFns<Double>(-6.0);
		int i = iOb.getOb(); //allows the return of an object with no requirement to cast due to autoboxing
		System.out.println(i);
		System.out.println(iOb.reciprical());
		System.out.println(dOb.fraction());
		if (iOb.absEquals(dOb)) { //even though iOb is an Integer object and dOb is a double object, the wildcard argument allows for different argument types
			System.out.println("Generics absolute value is the same");
		}
		else {
			System.out.println("Differing absolutes");
		}
	}

}
