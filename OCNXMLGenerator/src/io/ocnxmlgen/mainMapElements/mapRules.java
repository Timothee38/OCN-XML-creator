package io.ocnxmlgen.mainMapElements;

import io.ocnxmlgen.start;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mapRules {

	private static JFrame frame;
	public static String AmapRule;

	public static void mapRules() {

		JCheckBox chk = new JCheckBox("Do you want rules?");
		String msg = "Enter a rule tick the box if you do not want any";
		Object[] msgContent = { msg, chk };

		AmapRule = JOptionPane.showInputDialog(frame, msgContent, "rules",
				JOptionPane.YES_NO_OPTION);
		int result = JOptionPane.showConfirmDialog(null, AmapRule); // confirm
																	// box
		if (result == JOptionPane.OK_OPTION) {

			start.AMapRuleValue.setText("Map rules : " + AmapRule); //atm it only supports one rule TODO:make user type in all rules seperated by a "," with no spaces and use .split(",") to seperate them into different value
		}	start.AMapRuleValue.setVisible(true);
	}

}
