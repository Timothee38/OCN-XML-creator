package io.ocnxmlgen;

import java.io.File;

import javax.swing.JFileChooser;

public class FilePath {
	
	public static File xmlFile;

	public static void FilePath() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Set File Directory");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fileChooser.showOpenDialog(fileChooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			xmlFile = fileChooser.getSelectedFile();

			
			start.FileDir.setVisible(true);
			start.FileDir.setText("Map Proto: "+ xmlFile.getAbsolutePath());
			start.NextProtobtn.setVisible(true);
			
		}

	}
}
