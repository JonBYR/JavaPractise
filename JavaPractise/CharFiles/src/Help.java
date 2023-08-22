import java.io.*;
public class Help 
{ 
    String helpfile;
	
	Help(String fname) {
		helpfile = fname; //name of the file will be passed via a constructor in main method
	}
	boolean helpOn(String what) 
	{
		
		int ch;
		String topic, info;
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) { //code to read a file and also give access to methods like readline()
			do {
				ch = helpRdr.read(); //reads the first character of the helpfile
				if (ch == '#') {
					topic = helpRdr.readLine(); // will read the rest of the line of the file
					if (what.compareTo(topic) == 0) 
					{
						do {
							info = helpRdr.readLine(); //while read the lines underneath the topic
							if (info != null) System.out.println(info); //will go through each line until a blank line is found
						} while ((info != null) && info.compareTo("") != 0);
					}
					return true;	
					}
				} while (ch != -1); //while the end of the file is not reached
			}
		catch (IOException exc) {
			System.out.println("Error accessing the help file");
			return false; //catch statements can return values
		}
		return false;
     }
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //allows for user input
		System.out.print("Enter topic: ");
		try {
			topic = br.readLine(); //allows for user input to be stored as a string via InputStreamReader
		}
		catch (IOException exc) {
			System.out.println("Error reading console");
		}
		return topic; //topic will either be empty or a topic allowing for the execution of helpOn()
	} //InputStreamReader converts byte to char
}
	