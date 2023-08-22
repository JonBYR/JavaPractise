
public class Casts {

	public static void main(String[] args) {
		int a = 5, b = 6; //can assign multiple variables on one line
		double d;
		d = (double) b / a; //casting of a variable allows division of ints to return an exact value rather than a whole int
		int i;
		i = (int) (d / 1.0); //if casting a double to int brackets must be put over the operation and the cast
		System.out.println(d);
		System.out.println(i);
	}

}
