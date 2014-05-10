package io.ocnxmlgen;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import io.ocnxmlgen.mainMapElements.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


@SuppressWarnings("serial")
public class start extends JFrame {

	private JLabel welcomemsg;
	public JButton startbtn;
	public static JLabel mapProtoValue;
	public static JLabel FileDir;
	public static JButton NextProtobtn;
	
	public start() {
		super("Overcast Network XML generator");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 386, 0, 0};
		gridBagLayout.rowHeights = new int[]{14, 0, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
				

				
						welcomemsg = new JLabel("Welcome to the unofficial OCN XML generator by Captain_Elliott and Timothee38");
						GridBagConstraints gbc_welcomemsg = new GridBagConstraints();
						gbc_welcomemsg.anchor = GridBagConstraints.NORTHWEST;
						gbc_welcomemsg.insets = new Insets(0, 0, 5, 5);
						gbc_welcomemsg.gridx = 1;
						gbc_welcomemsg.gridy = 0;
						getContentPane().add(welcomemsg, gbc_welcomemsg);
				

				

				startbtn = new JButton("Start");
				GridBagConstraints gbc_startbtn = new GridBagConstraints();
				gbc_startbtn.insets = new Insets(0, 0, 5, 0);
				gbc_startbtn.anchor = GridBagConstraints.NORTH;
				gbc_startbtn.gridx = 2;
				gbc_startbtn.gridy = 0;
				getContentPane().add(startbtn, gbc_startbtn);
				
				FileDir = new JLabel("File Path: ");
				GridBagConstraints gbc_lblFilePath = new GridBagConstraints();
				gbc_lblFilePath.insets = new Insets(0, 0, 5, 5);
				gbc_lblFilePath.gridx = 1;
				gbc_lblFilePath.gridy = 1;
				getContentPane().add(FileDir, gbc_lblFilePath);
				FileDir.setVisible(false);
				
				NextProtobtn = new JButton("Next : Proto");
				GridBagConstraints gbc_btnNextProto = new GridBagConstraints();
				gbc_btnNextProto.insets = new Insets(0, 0, 5, 0);
				gbc_btnNextProto.gridx = 2;
				gbc_btnNextProto.gridy = 1;
				getContentPane().add(NextProtobtn, gbc_btnNextProto);
				NextProtobtn.setVisible(false);
				
				mapProtoValue = new JLabel();
				GridBagConstraints gbc_lblMapProto = new GridBagConstraints();
				gbc_lblMapProto.insets = new Insets(0, 0, 0, 5);
				gbc_lblMapProto.gridx = 1;
				gbc_lblMapProto.gridy = 2;
				getContentPane().add(mapProtoValue, gbc_lblMapProto);
				mapProtoValue.setVisible(false);
				
				startbtn.addActionListener(new ActionListener() { //action listener to check for a button press event
					public void actionPerformed(ActionEvent arg02) { //on action performed do...
						if (startbtn.isEnabled()) { //if start button is clicked
							startbtn.setVisible(false);
							FilePath.FilePath(); // runs filePaht()
						}
					}

				});
				
				NextProtobtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg03) {
					if(NextProtobtn.isEnabled()){
						NextProtobtn.setVisible(false);
						mapProto.mapProto(); //run mapProto() from io.ocnxmlgen.mainMapElements.mapProto
					}
				}
			});

	}

}
