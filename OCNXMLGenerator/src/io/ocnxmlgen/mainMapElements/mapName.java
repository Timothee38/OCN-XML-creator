package io.ocnxmlgen.mainMapElements;

import io.ocnxmlgen.start;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class mapName {
	
	public static String name;
	
	public static void mapName() {

		name = JOptionPane.showInputDialog("Enter your map's name");
		if (name != null) {
			JOptionPane.showMessageDialog(null, "You map name will be " + '"'
					+ name + '"', "Map Name", JOptionPane.PLAIN_MESSAGE);
			
			start.mapNameValue.setVisible(true);
			start.mapNameValue.setText("Map Name: " + name);
		}
	}
}
