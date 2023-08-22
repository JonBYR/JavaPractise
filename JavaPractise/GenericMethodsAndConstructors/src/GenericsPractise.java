
public class GenericsPractise { //generic methods and constructors can be declared in a non generic class
	private int sum;
	<E extends Number> GenericsPractise(E arg) { //constructor must also declare the condition for the generic as well as pass a generic reference value
		sum = 0;
		for (int i = 0; i < arg.intValue(); i++) { //converts the generic object to have an int value regardless of number type
			sum += i;
		}
	}
	int getSum() {
		return sum;
	}
	//Generic methods must declare conditions like: Compareable<T> which
	//is used to compare generics that are comparable to one another, while V can be a subclass or class of T
	//T[] and V[] refer to generic array objects that can be passed
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		if (x.length != y.length) return false;
		for (int i = 0; i < x.length; i++) {
			if (!x[i].equals(y[i])) return false;
		}
		return true;
	}
}
