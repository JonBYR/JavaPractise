
public class Queue {
	char q[];
	int putloc, getloc;
	Queue(int size) 
	{
		q = new char[size]; //creating a queue of characters with an initialised size
		putloc = getloc = 0;
	}
	public void put(char ch) 
	{
		if (putloc== q.length) 
		{
			System.out.println("Queue is full");
			return; //empty return to signify the end of the method
		}
		q[putloc++] = ch; //position of next stored element
	}
	public char get() 
	{
		if (getloc == putloc) 
		{
			System.out.println("Queue is empty");
			return (char) 0;
		}
		return q[getloc++]; //position of element we want to recieve
	}
}
