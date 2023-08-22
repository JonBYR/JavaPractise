
public class GenQueue<T> implements IGenQ<T> { //Generic class is also specified by T, must be generic if implimenting a generic interface
	private T q[]; //array that holds the q which is generic
	private int putloc, getloc;
	public GenQueue(T[] aRef) {
		q = aRef; //mapping the generic object to q which can be of any type of object
		putloc = getloc = 0; 
	}
	public void put(T obj) {
		q[putloc++] = obj; //will take a generic value and assign it to the generic array
	}
	public T get() {
		return q[getloc++]; //will return a generic value based on what is in the q array at this position
	}
}
