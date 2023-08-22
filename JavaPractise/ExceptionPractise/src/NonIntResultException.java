
public class NonIntResultException extends Exception { //custom exception must extend from the exception subclass
	int n;
	int d; //this exception requires values in the exception toString function
	NonIntResultException(int i, int j) {
		n = i;
		d = j; //constructor to initialise values
	}
	public String toString() {
		return "The result of dividing " + n + " by " + d + "is a non integer"; //toString will return this string for the error message
	}
}
