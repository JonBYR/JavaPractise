
public class QStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using bigQ to store the alphabet");
		for (i = 0; i < 26; i++) 
		{
			bigQ.put((char) ('A' + i));
		}
		System.out.println("Contents of bigQ: ");
		for (i = 0; i < 26; i++) 
		{
			ch = bigQ.get();
			if (ch != (char) 0) System.out.print(ch);
		}
		for (i = 0; i < 5; i++) 
		{
			smallQ.put((char) ('Z' - i));
		}
		for (i = 0; i < 5; i++) 
		{
			ch = smallQ.get();
			if (ch != (char) 0) System.out.print(ch);
		}
	}

}
