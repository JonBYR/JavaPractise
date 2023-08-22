import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //relevant imports for checkbox
public class CheckBoxDemo implements ItemListener { //as an item event is generated from a checkbox we need to impliment the ItemListener interface
	JLabel jlabSelected;
	JLabel jlabChanged; //Label objects declared
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma; //Checkbox objects declared
	CheckBoxDemo() {
		JFrame jfrm = new JFrame("Demonstrate Check Boxes");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(280, 120);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma"); //creation of the JCheckbox objects
		jcbAlpha.addItemListener(this); //as the events are generated on the checkboxes we assign the item listener as the checkbox object itself
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		jfrm.add(jcbAlpha);
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabChanged);
		jfrm.add(jlabSelected); //all containers added to the main frame container
		jfrm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie) { //implimenting the method of the interface
		String str = "";
		JCheckBox cb = (JCheckBox) ie.getItem(); //casts the item event (currently a reference to the object) as an actual JCheckBox object
		if (cb.isSelected()) jlabChanged.setText(cb.getText() + " was just selected."); //checks if the box is checked and if so returns true
		else jlabChanged.setText(cb.getText() + " was just cleared.");
		if (jcbAlpha.isSelected()) { //check the states of the checkboxes
			str += "Alpha ";
		}
		if (jcbBeta.isSelected()) {
			str += "Beta ";
		}
		if (jcbGamma.isSelected()) {
			str += "Gamma ";
		}
		jlabSelected.setText("Selected CheckBoxes: " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CheckBoxDemo();
			}
		});
	}

}
