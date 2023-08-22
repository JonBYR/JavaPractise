
public class NumberFns<T extends Number> { //generic class that will only accept objects of the Number parent class (i.e integer or number)
	T num; //generic object reference
	NumberFns(T ob) {
		num = ob;
	}
	double reciprical() {
		return 1 / num.doubleValue(); //converts a value to a double. As we are using a generic object we have to call the method on the object
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEquals(NumberFns<?> ob) { //use a wildcard generic as a parameter as we may want to pass through differing object types
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
		//as the object passed is refering to an object the parameter must call that object and it's method
		return false;
	}
	T getOb() { //returns the generic object
		return num;
	}
}
