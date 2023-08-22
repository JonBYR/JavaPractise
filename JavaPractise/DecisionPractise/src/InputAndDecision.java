import java.io.IOException;

public class InputAndDecision {

	public static void main(String[] args) throws IOException { //to get input the method must throw an IOException
		// TODO Auto-generated method stub
		try {
				System.out.println("Help on: 1 for if, 2 for switch");
				System.out.print("Choose one: ");
				char choice;
				choice = (char) System.in.read(); //character input must be casted as it is an int (unicode) by default
				char ignore;
				do { //do while loop will iterate through all characters while the condition is meet, ie a new line isn't created
					ignore = (char) System.in.read();
				} while(ignore != '\n');
			
			switch(choice) { //switch statement will accept a specific variable
			case '1': //condition for switch statement to check if variable is 1
				System.out.print("The if\n"); //\n used to create a new line
				System.out.print("if condition statement\n");
				System.out.print("Else statement");
				break; //break is normally standard for switch statements
			case '2': //switch statement for a second possibility of the variable
				System.out.print("You've just done a switch statement");
				break;
			default: //for any other instance of choice the default statement is printed
				System.out.println("Selection not found");
			} 
		}
		catch (IOException e)
		{
			System.out.println("Error from input");
		}
		
		
	}

}
