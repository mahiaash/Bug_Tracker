/**
 * 
 */
package view;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

/**
 * @author mahia
 *
 */
public class GUI {

	/**
	 * @param args
	 */
	public static void createUI() {
		String [] labels = {"Summary: ", "Bug Location: ", "Bug Level: ", " "};
		int labelSize = labels.length;
		System.out.println(labelSize);
		String [] dropDown = {"Select","Important", "To Do", "Unimportant"};
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
		frame.setSize(500, 500);
		
		
		
		JPanel controller = new JPanel();
		controller.setLayout(new SpringLayout());
		
		for(int i = 0; i < labelSize; i++) {
			JLabel label = new JLabel(labels[i], JLabel.TRAILING);
			controller.add(label);
			if(i == 0 || i == 1) {
			JTextArea jtext = new JTextArea(5,5);
			controller.add(jtext);
			}
			if(i == 2) {
				JComboBox<String> jcbox = new JComboBox<String>(dropDown);
				jcbox.setSelectedIndex(0);
				controller.add(jcbox);
			}
			if(i == 3) {
			JButton jbutton = new JButton();
			jbutton.setText("Submit");
			controller.add(jbutton);
		
			}
		}
		
		Form.makeCompactGrid(controller, labelSize, 2, 6, 6, 6, 6);
		
		
		
		
		
		frame.setContentPane(controller);
		controller.setOpaque(true);
		frame.setContentPane(controller);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createUI();
			}
		});
		

}

	
}