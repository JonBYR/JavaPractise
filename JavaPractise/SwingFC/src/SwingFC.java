import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //required imports for creation of a button and text field in swing
import java.io.*;
public class SwingFC implements ActionListener { //as buttons and text fields use action events the actionlistener interface is needed
	JTextField jtfFirst;
	JTextField jtfSecond; //declaration of a text field object
	JButton jbtnComp; //declaration of a button object
	JLabel jlabFirst;
	JLabel jlabSecond; //declaration of a label object
	JLabel jlabResult;
	SwingFC() { //empty constructor needed to create the swing GUI commands
		JFrame jfrm = new JFrame("Compare Files"); //creation of a frame object which is the top-level container that will contain all other containers
		jfrm.setLayout(new FlowLayout()); //converts the frame to a flow layout that will cause containers to fill left to right, top to bottom
		jfrm.setSize(200, 190); //sets the size of the frame (for the application)
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //causes the application to cease when the window closes
		jtfFirst = new JTextField(14); //sets the required coloums for the userinput
		jtfSecond = new JTextField(14);
		jbtnComp = new JButton("Compare"); //sets the name of the button
		jbtnComp.addActionListener(this); //sets the button as an action listener
		//should the text fields need to be an action listener to, use jtfFirst.setActionListener("myTxt") to set the name of the action listener
		//then jtfFirst.addActionListener(this) to have the text field as an action listener
		jlabFirst = new JLabel("First File: ");
		jlabSecond = new JLabel("Second File: ");
		jlabResult = new JLabel(" ");
		jfrm.add(jlabFirst);
		jfrm.add(jtfFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfSecond);
		jfrm.add(jbtnComp);
		jfrm.add(jlabResult); //add all containers to the main frame top level container
		jfrm.setVisible(true); //make sure the frame is visible
	}
	public void actionPerformed(ActionEvent ae) { //implementing the method from the ActionListener interface, will trigger once the button is pressed
		int i, j;
		if(jtfFirst.getText().equals("")) {
			jlabResult.setText("First name of the file missing");
		}
		if(jtfSecond.getText().equals("")) {
			jlabResult.setText("Second name of the file missing");
		}
		try (FileInputStream f1 = new FileInputStream(jtfFirst.getText()); FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
			//use of a try with resources block to automatically close both files
			do {
				i = f1.read();
				j = f2.read();
				if (i != j) break; //if the characters are not the same, the loop breaks
			} while (i != -1 && j != -1); //checks that the end of the file is not reached
			if (i != j) jlabResult.setText("Files are not the same"); //outputs to the UI
			else jlabResult.setText("Files are the same");
		}
		catch (IOException exc) {
			jlabResult.setText("File error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new SwingFC(); //call the constructor containing swing
		} 
	}); //runnable takes annonymous class argument
	}

}
//note that to check for specific event changes in actionPreformed like the compare button use ae.getActionCommand.equals("Compare")