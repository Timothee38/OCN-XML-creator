package io.ocnxmlgen.mainMapElements;

import io.ocnxmlgen.start;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class mapObjective {

	public static String obj;

	public static void mapObjective() {
		obj = JOptionPane
				.showInputDialog("Enter the maps Objective (leave blank for no objective)");
		int result = JOptionPane.showConfirmDialog(null, obj);
		if (result == JOptionPane.OK_OPTION) {
			start.MapObjectiveValue.setText("Map Objective: " + obj);
			start.MapObjectiveValue.setVisible(true);
		}
	}

}
