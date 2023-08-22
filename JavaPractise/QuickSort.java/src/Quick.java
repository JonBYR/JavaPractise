
public class Quick {
	static void qsort(char items[]) //default is public
	{
		qs(items, 0, items.length-1); //all static methods so must be called by class and can only use static variables of class
	}
	private static void qs(char items[], int left, int right) //private as we do not need to call outside class
	{
		int i, j;
		char x, y;
		i = left; j = right;
		x = items[(left+right)/2];
		do {
			while((items[i] < x) && (i < right)) i++;
			while ((x < items[j]) && (j > left)) j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;
			}
		} while (i <= j);
		if (left < j) qs(items,  left, j); //recursion will split the two arrays in half and individually sort them
		if (i < right) qs(items, i, right);
	} //since arrays are objects they can be passed by reference and so can be changed without needing to return a value
}
