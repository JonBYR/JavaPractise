
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};
		Double nums3[] = {2.0, 4.0, 6.0};
		Double nums4[] = {1.0, 3.0, 4.0};
		if(GenericsPractise.arraysEqual(nums, nums2)) System.out.println("Arrays are equal"); //can compare different Integer[] arrays or Double[] arrays
		if(GenericsPractise.arraysEqual(nums3, nums4)) System.out.println("Arrays are equal"); //however cannot compare a Integer[] and Double[] array
		GenericsPractise ob = new GenericsPractise(4.0); //can pass a value that will be casted as a Double object in the constuctor
		System.out.println(ob.getSum());
	}

}
