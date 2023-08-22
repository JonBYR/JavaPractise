
public class VaTest {
	static void vaArgs(int ... v) //variable argument taken by method
	{
		System.out.println("Number of args: " + v.length); //variable argument treated as an array with array arguments
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++) 
		{
			System.out.println(" arg " + i + ": " + v[i]);
		}
	}
}
