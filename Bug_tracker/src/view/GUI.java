/**
 * 
 */
package view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.JTextField;
import javax.swing.SpringLayout;

import java.awt.Dimension;
import java.awt.event.*;

/**
 * @author mahia
 *
 */
public class GUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is where the UI will go
		String[] labels = {"Summary: ", "Location: ", "Bug Level: "}; 
		JFrame frame = new JFrame();
		JButton jbutton = new JButton();
		jbutton.setText("Submit");
		JPanel controller = new JPanel(new SpringLayout());
		for(int i = 0; i < 3; i++) {
			JLabel jlabel = new JLabel(labels[i], JLabel.TRAILING);
			controller.add(jlabel);
			JTextArea tarea = new JTextArea(10,10);
			tarea.setLineWrap(true);
			jlabel.setLabelFor(tarea);
			controller.add(tarea);
		}
		controller.add(jbutton);
		
		frame.setContentPane(controller);
		SpringUtility.makeCompactGrid(controller,3,2,6,6, 3, 3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.setOpaque(true);
		frame.setContentPane(controller); 
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
		frame.setSize(500, 500);
		

}

	
}