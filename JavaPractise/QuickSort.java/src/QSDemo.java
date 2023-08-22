
public class QSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i'};
		int i;
		System.out.print("Original array: ");
		for (i=0; i < a.length; i++) System.out.print(a[i]); //as the conditional code is one line it can be put on one line
		System.out.println();
		Quick.qsort(a); //statics can accept paramaters regardless if those are static
		System.out.print("Sorted array: ");
		for(i = 0; i < a.length; i++) System.out.print(a[i]);
	}

}
