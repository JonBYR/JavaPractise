import java.io.*; //to use the features of I/0 class hierachy it must be imported
public class CompFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int k = 65;
		try (FileInputStream f1 = new FileInputStream("First.txt"); FileInputStream f2 = new FileInputStream("Second.txt");
				FileOutputStream f3 = new FileOutputStream("Third.txt")) //use of output stream will create the file if it doesn't exist and then allow stuff to be written to it 
		{ //try with resources block allows you to open the files in the try statement and then will automatically close without needing to use the close() method
			do {
				i = f1.read(); //as the files are input streams we can only read the infomation in them
				j = f2.read();
				if (i != j) break;
			} while (i != -1 && j != -1); //if i and j return -1 in read then the end of the file has been reached
			if (i != j) 
			{
				System.out.println("Files differ.");
			}
			else 
			{
				System.out.println("Files are the same");
			}
			f3.write(k); //will write the int value of k as an ASCII character. To write the value as an int a DataOutputStream must be created instead and method writeInt() used
		}
		catch (IOException exc) //as FileNotFoundException is a child of IOException an IOException will cover for both exceptions in a catch statement
		{
			System.out.println("I/O Error: " + exc);
		}
	} //remember that byte will refer to binary values, so if 2 is a char it will return the value of the char 2 rather than the int 2
	//RandomAccessFile will allow for random access of files and will allow for "r" (read) or "rw" (read write). the method seek() is used
	//to access at a specific point, using a long value
}
