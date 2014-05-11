package io.ocnxmlgen.mainMapElements;

import io.ocnxmlgen.start;

import javax.swing.JOptionPane;

public class mapVersion {
	
	public static String version;
	
	public static void mapVersion() {
		
		version = JOptionPane.showInputDialog("Enter your maps version : Usually <Major>.<minor>.<revision>");
		int result = JOptionPane.showConfirmDialog(null, version); //confirm box
		if(result == JOptionPane.OK_OPTION) {
			
			start.MapVersionValue.setText("Map Version: " + version);
			start.MapVersionValue.setVisible(true);
			
		}
		
	}

}
