
public class ExceptionsMain {
static int dividingByZero(int error, int secondError) throws ArithmeticException //if a function will throw an error and is not using a try block then it needs to notify the compiler it can throw and error
{
	return error / secondError;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = {2, 3, 4, 6, 8};
		int[] second = {2, 4, 4, 6, 8};
		int errorInt = 5;
		int anotherErrorInt = 0;
		try 
		{
			dividingByZero(errorInt, anotherErrorInt); //the error will be caught in the function and then go to the relevant catch statement below
			for (int i = 0; i < first.length; i++) 
			{
				if (first[i] % second[i] != 0) throw new NonIntResultException(first[i], second[i]); //how to throw the custom exception
				System.out.println(first[i] / second[i]);
			}
		}
		catch (ArithmeticException exc) 
		{
			System.out.println(exc);
		}
		catch (NonIntResultException exc) //how to catch the custom exception
		{
			System.out.println(exc);
		}
	} //note that the first exception handled will cease the try block completely.

}
