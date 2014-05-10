package io.ocnxmlgen.mainMapElements;

import io.ocnxmlgen.start;

import javax.swing.JOptionPane;



public class mapProto {
	public static String proto;
	public static void mapProto() {
		proto = JOptionPane
				.showInputDialog("Enter the current map proto");
		int result = JOptionPane.showConfirmDialog(null, proto); //confirm box
		if(result == JOptionPane.OK_OPTION){
			start.mapProtoValue.setText("Map Proto: " + proto); //prints proto on gui
			start.mapProtoValue.setVisible(true);
		}
	}
	
	


}
