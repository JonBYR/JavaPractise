
public class GenericQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iStore[] = new Integer[10]; //creating an array of Integer objects
		GenQueue<Integer> q = new GenQueue<Integer>(iStore); //creation of generic object that is of type Integer and needs iStore for the constructor
		Integer iVal;
		System.out.println("Demonstrating a queue of integers");
		for (int i = 0; i < 5; i++) {
			q.put(i); //as i will match the type of object in the generic class we can use ints for q
		}
		for (int j = 0; j < 5; j++) {
			iVal = q.get(); //allows for autoboxing of int values to an Integer object
			System.out.println(iVal);
		}
		System.out.println();
		Double dStore[] = new Double[10];
		GenQueue<Double> q2 = new GenQueue<Double>(dStore); //as GenQueue is generic we can make objects of different types
		Double dVal;
		for (int i = 0; i < 5; i++) {
			q2.put((double) i / 2); //doubles will be used for 
		}
		for (int j = 0; j < 5; j++) {
			dVal = q2.get(); //allows for autoboxing of double values
			System.out.println(dVal);
		}
	}

}
