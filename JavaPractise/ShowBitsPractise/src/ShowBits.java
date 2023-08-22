
public class ShowBits {
	int numbits;
	ShowBits(int n) 
	{
		numbits = n;
	}
	void show(long val) 
	{
		long mask = 1;
		mask <<= numbits-1; //bitwise shift to the left to shift a 1 in the proper position
		int spacer = 0;
		for(; mask != 0; mask >>>= 1) //for loop doesn't need to have all bits filled, unsigned right shift
		{
			if ((val & mask) != 0) System.out.print("1"); //if the binary value of val and mask are both 1 then a 1 is printed
			else System.out.print("0"); //otherwise 0 is printed
			spacer++;
			if ((spacer % 8) == 0) 
			{
				System.out.print(" "); //if spacer is 8 then all binary rows are filled so must be reset
				spacer = 0;
			}
		}
		System.out.println();
	}
}
