import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*; //relevant imports for the JLists
public class JListDemo implements ListSelectionListener { //as the JList objects will trigger a listselection event, the listselctionlistener interface is required
	JList<String> jlst; //declaration of a JList (which is generic)
	JLabel jlab;
	JScrollPane jscroll; //declaration of a JScrollPlane which is used to make a list scrollable
	String names[] = { "Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom", "Mary", "Ken", "Andrew", "Matt", "Todd" };
	JListDemo() {
		JFrame jfrm = new JFrame("JList Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200, 160);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlst = new JList<String>(names); //creation of a new JList object
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //sets the number of items that can be selected to only 1 as it's in single selection mode
		jscroll = new JScrollPane(jlst); //creation of a new JScrollPane object
		jscroll.setPreferredSize(new Dimension(120, 90)); //sets the size of the scroll
		jlab = new JLabel("Please choose a name:");
		jlst.addListSelectionListener(this); //as the JList object is the one triggering the list selection event, it must be passed in addListSelectionListener
		jfrm.add(jscroll); //as the JList is included in the JScrollPane only jscroll needs to be passed to the main frame container
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public void valueChanged(ListSelectionEvent le) { //implimenting the method of the interface
		int idx = jlst.getSelectedIndex(); //get the index of the changed item that was triggering the ListSelectionEvent
		if (idx != -1) jlab.setText("Current selection: " + names[idx]); //if the index is a place in the list then the if statement is executed
		else jlab.setText("Please choose a name");
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JListDemo();
			}
		});
		// TODO Auto-generated method stub

	}

}
