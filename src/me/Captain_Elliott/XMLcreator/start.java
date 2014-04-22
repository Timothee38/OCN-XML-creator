package me.Captain_Elliott.XMLcreator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import me.Captain_Elliott.XMLcreator.XML.XMLCreation;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class start extends JFrame {

	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JLabel item4;
	private JLabel directory;
	private JButton startbtn;
	private JButton nextbtn;

	public String DirPath;
	public String MapXML;
	

	public String name;
	public String version;
	public String objective;
	public String rules;
	public String[] rulesArray;


	public start() {

		setTitle("XML Creator");
		setLayout(new FlowLayout());

		item1 = new JLabel(
				"This is a XML creator for maps used for the over cast network");
		add(item1);
		item2 = new JLabel(
				"This was developed by Captain_Elliott and Timothee38");
		add(item2);

		startbtn = new JButton("Start!");
		add(startbtn);

		Handler handler = new Handler();
		startbtn.addActionListener(handler);

	}

	public void Step2() {
		item1.setText("");
		item2.setText("");
		startbtn.setVisible(false);
		item3 = new JLabel("Browe for a location where you want the map XML to be put");
		add(item3);
	
		final JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.showSaveDialog(null);
		int response = fc.showSaveDialog(this);
		directory = new JLabel("");
		add(directory);
		if(response == JFileChooser.APPROVE_OPTION){
		String path = fc.getSelectedFile().toString();
			directory.setText('"' + path  + '"' + " Is where the XML file will be created");
		} 		
		DirPath = fc.getSelectedFile().toString();
		MapXML = "\\map.xml";
		
			nextbtn = new JButton("Next");
			add(nextbtn);
			
			Handler2 handler2 = new Handler2();
			nextbtn.addActionListener(handler2);
			
	}

	public void Step3() {
		item3.setText("");
		directory.setText("");
		nextbtn.setVisible(false);
		JTextField MapName = new JTextField("Enter the name you your map");
		add(MapName);
		JTextField Version = new JTextField("Enter Map Version");
		Version.setToolTipText("eg. V1.2.1");
		add(Version);
		JTextField Objective = new JTextField(
				"What is the objective of the map?");
		add(Objective);
		JCheckBox cbox = new JCheckBox();
		add(cbox);
		final JTextField Rules = new JTextField("add rules");
		Rules.setToolTipText("use a simi colon to seperate rules");

		ItemListener itemListener = new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				Rules.setEnabled(e.getStateChange() == ItemEvent.SELECTED);

			}

		};
		cbox.addItemListener(itemListener);
		add(Rules);
		nextbtn = new JButton("Next");
		add(nextbtn);

		Handler3 handler3 = new Handler3();
		nextbtn.addActionListener(handler3);

		name = MapName.getText();
		version = Version.getText();
		objective = Objective.getText();
		rules = Rules.getText();
		rulesArray = rules.split(";");

		

	}

	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startbtn) {
				Step2();
			}

		}
	}

	class Handler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nextbtn) {
				Step3();
			}

		}
	}

	class Handler3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nextbtn) {
				XMLCreation.XMLCreation();
				System.out.println("add stuff");
			}

		}
	}

}
