package control;
 
import java.awt.event.*;

import view.GUI;



public class Listen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String listening = e.getActionCommand();
		if(listening.equals("Home")) {
			GUI.createHomePage();
		}
		if(listening.equals("Bugs")) {
			GUI.createBugPage();
			
		}
		if(listening.equals("Tasks")) {
			
		}
		if(listening.equals("Notifications")) {
			
		}
	}

}
