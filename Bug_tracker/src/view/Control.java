/**
 * 
 */
package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * @author mahia
 *
 */
public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is where the UI will go
		String[] labels = {"Summary: ", "Location: ", "Bug Level: "}; 
		JFrame frame = new JFrame();
		JTextField textSum = new JTextField();
		JTextField textLoc = new JTextField();
		JTextField textLev = new JTextField();
		JPanel controller = new JPanel(new SpringLayout());
		for(int i = 0; i < 3; i++) {
			JLabel jlabel = new JLabel(labels[i], JLabel.TRAILING);
			controller.add(jlabel);
			
		}
		frame.setContentPane(controller);
	}

}
