package io.ocnxmlgen;

import java.io.File;

import javax.swing.JFileChooser;

public class FilePath {
	
	public static File xmlFile;
	public static String xmlFilePath;

	public static void FilePath() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Set File Directory");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fileChooser.showOpenDialog(fileChooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			xmlFile = fileChooser.getSelectedFile();
			xmlFilePath = xmlFile.getAbsolutePath();
						
			start.FileDir.setVisible(true);
			start.FileDir.setText("File Directory: " + xmlFilePath);
			
		}

	}
}
