import java.util.function.Predicate; //inbuilt interfaces must be imported in
public class UsePredicateInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven = (n) -> (n%2) == 0; //as it is an interface with an empty test(T val) method we use a lambda to overwrite the method and give it a body
		//As it is generic we need to create a generic interface object
		if (isEven.test(4)) System.out.println("4 is even");
	}

}
