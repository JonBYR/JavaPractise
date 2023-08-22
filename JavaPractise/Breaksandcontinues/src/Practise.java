
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i <=100; i++) 
		{
			if ((i % 2) != 0) continue; //loop will ignore the rest of the commands below if the condition is met and will instead increment i and start again
			System.out.println(i); //only even numbers printed as they will not be ignored
		}
		for (int j = 0; j < 3; j++) 
		{
			System.out.println("Outer loop count: " + j);
			System.out.print("        Inner loop count: ");
			int t = 0;
			while (t < 100) 
			{
				if (t == 10) break; //while loop will terminate if t is 10 and prevent it from continuing
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.println("Loops complete");
		for (int k = 1; k < 4; k++) 
		{
			one: { //define label
			two: {
			three: {
				System.out.println("\nk is " + k); //consider labels as breaking a section of a loop rather than a whole loop
				if (k==1) break one; //if this condition is reached go to the end of label one
				if (k==2) break two; //if this condition is reached go to the end of label two
				if (k==3) break three; //if this condition is reached go to the end of label three
			} //end of label three
			System.out.println("After block three");
			} //end of label two
			System.out.println("After block two");
			} //end of label one
			System.out.println("After block one");
		} //end of for loop
		System.out.println("After for loop");
	}

}
