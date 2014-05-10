package io.ocnxmlgen.mainMapElements;

import javax.swing.JOptionPane;
import io.ocnxmlgen.*;

public class mapObjective {
	
	public static String obj;
	
	public static void mapObjective(){
		obj = JOptionPane.showInputDialog("Enter the maps Objective (leave blank for no objective)");
		if(obj!=null){
			JOptionPane.showConfirmDialog(null, obj);
			
			start.MapObjectiveValue.setText("Map Objective: " + obj);
		} 
			start.MapObjectiveValue.setText("Map Objective: Null Value");
	}
}
