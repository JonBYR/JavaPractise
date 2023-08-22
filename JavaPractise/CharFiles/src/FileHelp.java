
public class FileHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Help helpObject = new Help("helpfile.txt"); //passes the filename to the constructor
		String topic;
		System.out.println("Try the help system, enter stop to end");
		do {
			topic = helpObject.getSelection(); //can call the method repeatedly in the main class and is returned
			if (!helpObject.helpOn(topic)) {
				System.out.println("Topic not found\n");
			}
		} while (topic.compareTo("stop") != 0);
	} //use FileWriter to write things to a file with the write() command (or the parseVariabletype for specifiic variables like ints
	//syntax FileWriter variableName = new FileWriter(file)
	//PrinterWriter pw = new PrintWriter(System.out, true); will allow output to be called by the pw object rather than System.out

}
