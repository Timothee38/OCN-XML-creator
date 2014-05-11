package io.ocnxmlgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.xml.sax.SAXException;

import io.ocnxmlgen.mainMapElements.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.IOException;


@SuppressWarnings("serial")
public class start extends JFrame {

	private JLabel welcomemsg;
	public JButton startbtn;
	public static JLabel mapProtoValue;
	public static JLabel FileDir;
	public static JButton NextProtobtn;
	public static JLabel mapNameValue;
	private JButton NextNamebtn;
	public static JLabel MapObjectiveValue;
	private JButton NextObjectivetn;
	private JButton DebugXML; 				//Debugging purpose - lets you create xml file - remove later
	public static JLabel MapVersionValue;
	private JButton NextVersionbtn;
	private JButton NextRulesbtn;
	public static JLabel AMapRuleValue;
	
	public start() {
		super("Overcast Network XML generator");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 386, 0, 0};
		gridBagLayout.rowHeights = new int[]{14, 0, 23, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
				

				
		welcomemsg = new JLabel();
		welcomemsg.setText("Welcome to the unofficial OCN XML generator by Captain_Elliott and Timothee38");
		GridBagConstraints gbc_welcomemsg = new GridBagConstraints();
		gbc_welcomemsg.anchor = GridBagConstraints.NORTHWEST;
		gbc_welcomemsg.insets = new Insets(0, 0, 5, 5);
		gbc_welcomemsg.gridx = 1;
		gbc_welcomemsg.gridy = 0;
		getContentPane().add(welcomemsg, gbc_welcomemsg);
				

				

				startbtn = new JButton("Start");
				GridBagConstraints gbc_startbtn = new GridBagConstraints();
				gbc_startbtn.insets = new Insets(0, 0, 5, 5);
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
				gbc_btnNextProto.insets = new Insets(0, 0, 5, 5);
				gbc_btnNextProto.gridx = 2;
				gbc_btnNextProto.gridy = 1;
				getContentPane().add(NextProtobtn, gbc_btnNextProto);
				NextProtobtn.setVisible(false);
				
				mapProtoValue = new JLabel("Map Proto: ");
				GridBagConstraints gbc_lblMapProto = new GridBagConstraints();
				gbc_lblMapProto.insets = new Insets(0, 0, 5, 5);
				gbc_lblMapProto.gridx = 1;
				gbc_lblMapProto.gridy = 2;
				getContentPane().add(mapProtoValue, gbc_lblMapProto);
				mapProtoValue.setVisible(false);
				
				NextNamebtn = new JButton("Next : Name");
				GridBagConstraints gbc_btnNextName = new GridBagConstraints();
				gbc_btnNextName.insets = new Insets(0, 0, 5, 5);
				gbc_btnNextName.gridx = 2;
				gbc_btnNextName.gridy = 2;
				getContentPane().add(NextNamebtn, gbc_btnNextName);
				NextNamebtn.setVisible(false);
				
				mapNameValue = new JLabel("Map Name: ");
				GridBagConstraints gbc_lblMapName = new GridBagConstraints();
				gbc_lblMapName.insets = new Insets(0, 0, 5, 5);
				gbc_lblMapName.gridx = 1;
				gbc_lblMapName.gridy = 3;
				getContentPane().add(mapNameValue, gbc_lblMapName);
				mapNameValue.setVisible(false);
				
				DebugXML = new JButton("Debug - Write XML"); 				//Debugging purpose - lets you create xml file - remove later
				GridBagConstraints gbc_DebugXML = new GridBagConstraints();
				gbc_DebugXML.insets = new Insets(0, 0, 5, 0);
				gbc_DebugXML.gridx = 3;
				gbc_DebugXML.gridy = 0;
				getContentPane().add(DebugXML, gbc_DebugXML);
				
				NextVersionbtn = new JButton("Next : Version");
				GridBagConstraints gbc_btnNextVersion = new GridBagConstraints();
				gbc_btnNextVersion.insets = new Insets(0, 0, 5, 5);
				gbc_btnNextVersion.gridx = 2;
				gbc_btnNextVersion.gridy = 3;
				getContentPane().add(NextVersionbtn, gbc_btnNextVersion);
				NextVersionbtn.setVisible(false);
				
				MapVersionValue = new JLabel("Map Version: ");
				GridBagConstraints gbc_lblMapVersion = new GridBagConstraints();
				gbc_lblMapVersion.insets = new Insets(0, 0, 5, 5);
				gbc_lblMapVersion.gridx = 1;
				gbc_lblMapVersion.gridy = 4;
				getContentPane().add(MapVersionValue, gbc_lblMapVersion);
				MapVersionValue.setVisible(false);
				
				NextObjectivetn = new JButton("Next : Objective");
				GridBagConstraints gbc_btnNextObjective = new GridBagConstraints();
				gbc_btnNextObjective.insets = new Insets(0, 0, 5, 5);
				gbc_btnNextObjective.gridx = 2;
				gbc_btnNextObjective.gridy = 4;
				getContentPane().add(NextObjectivetn, gbc_btnNextObjective);
				NextObjectivetn.setVisible(false);				
				
				MapObjectiveValue = new JLabel("Map Objective: ");
				GridBagConstraints gbc_lblMapObjective = new GridBagConstraints();
				gbc_lblMapObjective.insets = new Insets(0, 0, 5, 5);
				gbc_lblMapObjective.gridx = 1;
				gbc_lblMapObjective.gridy = 5;
				getContentPane().add(MapObjectiveValue, gbc_lblMapObjective);
				MapObjectiveValue.setVisible(false);
				
				NextRulesbtn = new JButton("Next : Rules");
				GridBagConstraints gbc_btnNextRules = new GridBagConstraints();
				gbc_btnNextRules.insets = new Insets(0, 0, 5, 5);
				gbc_btnNextRules.gridx = 2;
				gbc_btnNextRules.gridy = 5;
				getContentPane().add(NextRulesbtn, gbc_btnNextRules);
				NextRulesbtn.setVisible(false);
				
				AMapRuleValue = new JLabel("A Map Rule: ");
				GridBagConstraints gbc_lblAMapRule = new GridBagConstraints();
				gbc_lblAMapRule.insets = new Insets(0, 0, 0, 5);
				gbc_lblAMapRule.gridx = 1;
				gbc_lblAMapRule.gridy = 6;
				getContentPane().add(AMapRuleValue, gbc_lblAMapRule);
				AMapRuleValue.setVisible(false);

				
				startbtn.addActionListener(new ActionListener() { //action listener to check for a button press event
					public void actionPerformed(ActionEvent arg02) { //on action performed do...
						if (startbtn.isEnabled()) { //if start button is clicked
							startbtn.setVisible(false);
							FilePath.FilePath(); // runs filePaht()
							NextProtobtn.setVisible(true);
						}
					}

				});
				
				NextProtobtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg03) {
					if(NextProtobtn.isEnabled()){
						NextProtobtn.setVisible(false);
						mapProto.mapProto(); //run mapProto() from io.ocnxmlgen.mainMapElements.mapProto
						NextNamebtn.setVisible(true);						
					}
				}
			});
				
				NextNamebtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg03) {
						if(NextNamebtn.isEnabled()){
							NextNamebtn.setVisible(false);
							mapName.mapName(); //run maoName() from io.ocnxmlgen.mainMapElements.mapName
							NextVersionbtn.setVisible(true);
						}
					}
				});
				
				NextVersionbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg03) {
						if(NextVersionbtn.isEnabled()){
							NextVersionbtn.setVisible(false);
							mapVersion.mapVersion(); //run mapVersion() from io.ocnxmlgen.mainMapElements.mapVersion
							NextObjectivetn.setVisible(true);
						}
					}
				});
				
				NextObjectivetn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg03) {
						if(NextVersionbtn.isEnabled()){
							NextRulesbtn.setVisible(true);
							mapObjective.mapObjective(); //run mapObjective() from io.ocnxmlgen.mainMapElements.map Objective
							NextObjectivetn.setVisible(false);
						}
					}
				});
				
				NextRulesbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg03) {
						if(NextRulesbtn.isEnabled()){

							mapRules.mapRules(); //run mapRules() from io.ocnxmlgen.mainMapElements.mapValues
							NextRulesbtn.setVisible(false);
						}
					}
				});
				
				//Debugging purpose - lets you create xml file - remove later
				DebugXML.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg03) {
						if(DebugXML.isEnabled()){
							System.out.println("Debug");
							System.out.println(FilePath.xmlFilePath);
							try {
								writeXML.writeXML();
							} catch (ParserConfigurationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (TransformerException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					}
				});

	}

}
