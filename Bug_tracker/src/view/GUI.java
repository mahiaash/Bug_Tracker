/**
 * 
 */
package view;


import java.awt.Font;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import control.Listen;

/**
 * @author mahia
 *
 */
public class GUI {

	/**
	 * @param args
	 */
	static JPanel homePanel;
	static Listen listens;
//	static JPanel bugPanel;
//	static JPanel universalPanel;
	public static void createTaskAdderPage() {
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
	public static void createHomePage() {
		//Create Frame and panel
		JFrame homeFrame = new JFrame();
		homePanel = new JPanel();
		homePanel.setVisible(true);
		homeFrame.add(homePanel);
		homeFrame.setContentPane(homePanel);
//		universalPanel.add(homePanel);
		//Implement GridBagLayout
		homePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbConstraints = new GridBagConstraints();
		
		//Create Labels and add to panel
		JLabel homeLabel = new JLabel("Welcome!");
		homeLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		homeLabel.setHorizontalAlignment(JLabel.CENTER);
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.weightx = 0.5;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		gbConstraints.gridwidth = 4;
		gbConstraints.ipady = 40;
		homePanel.add(homeLabel,gbConstraints);
		
		
		JLabel currentLabel = new JLabel("Current Task: ");
		currentLabel.setFont(new Font("Baskerville", Font.PLAIN, 12 ));
		gbConstraints.fill = GridBagConstraints.BOTH;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 2;
		gbConstraints.weightx = 1.0;
		gbConstraints.weighty = 1.0;
		homePanel.add(currentLabel, gbConstraints);
		
		JLabel foundLabel = new JLabel("Number of found bugs: ");
		foundLabel.setFont(new Font("Baskerville", Font.PLAIN, 12 ));
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 3;
//		gbConstraints.weightx = 1.0;
		homePanel.add(foundLabel, gbConstraints);
		

		JLabel solvedLabel = new JLabel("Number of Solved bugs: ");
		solvedLabel.setFont(new Font("Baskerville", Font.PLAIN, 12 ));
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 4;
		gbConstraints.weightx = 1.0;
//		gbConstraints.weighty = 1.0;
		homePanel.add(solvedLabel, gbConstraints);		
		
		//Create TextField for putting and updating info on Current Task
		JTextField currentTaskText = new JTextField(10);
		currentTaskText.setEditable(false);
		currentTaskText.setText("later connected");
		currentTaskText.setFont(new Font("Baskerville", Font.PLAIN, 12));
		gbConstraints.fill = GridBagConstraints.REMAINDER;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 2;
		gbConstraints.weightx = 0.2;
		gbConstraints.gridwidth = 0;
		homePanel.add(currentTaskText, gbConstraints);
		
		//Create TextField for putting and updating info on number of found bugs
		
		JTextField foundBugText = new JTextField(10);
		foundBugText.setEditable(false);
		foundBugText.setText("later connected");
		foundBugText.setFont(new Font("Baskerville", Font.PLAIN, 12));
		gbConstraints.fill = GridBagConstraints.REMAINDER;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 3;
		gbConstraints.weightx = 0.2;
		gbConstraints.gridwidth = 0;
		homePanel.add(foundBugText, gbConstraints);
		
		// Create TextField for putting and updating info on number of solved bugs
		
		JTextField solvedBugText = new JTextField(10);
		solvedBugText.setEditable(false);
		solvedBugText.setText("later connected");
		solvedBugText.setFont(new Font("Baskerville", Font.PLAIN, 12));
		gbConstraints.fill = GridBagConstraints.REMAINDER;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 4;
		gbConstraints.weightx = 0.2;
		gbConstraints.gridwidth = 0;
		homePanel.add(solvedBugText, gbConstraints);
		
		
		//Create Menu Bar and populate the menu
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jmenu = new JMenu("Menu");
		JMenuItem home = new JMenuItem("Home");
		JMenuItem bugs = new JMenuItem("Bugs");
		JMenuItem tasks = new JMenuItem("Tasks");
		JMenuItem notifications = new JMenuItem("Notifications");
		jMenuBar.add(jmenu);
		jmenu.add(home);
		jmenu.add(bugs);
		jmenu.add(tasks);
		jmenu.add(notifications);
		
		// add menu to panel and set Menu bar on the frame
		homePanel.add(jMenuBar);
		homeFrame.setJMenuBar(jMenuBar);
		
		// adding action listener
		listens = new Listen();
		bugs.addActionListener(listens);
		createBugPage();
		
		
		//Frame operations
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.pack();
		homeFrame.setLocationRelativeTo(null);
		homeFrame.setVisible(true); 
		homeFrame.setSize(900, 600);
		
	}
	
	
	public static void createBugPage() {
		
		JPanel bugPanel = new JPanel();
//		homePanel.add(bugPanel);
		homePanel.setVisible(false);
		bugPanel.setVisible(true);
		JTextField fie = new JTextField("BUG PAGE!!!!");
		bugPanel.add(fie);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
//				createTaskAdderPage();
				createHomePage();
				// Testing to show stuff
			}
		});
		

}

	
}