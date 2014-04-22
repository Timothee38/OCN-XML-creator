package me.Captain_Elliott.XMLcreator.XML;

import me.Captain_Elliott.XMLcreator.start;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLCreation {
	
	//local version of variables
	public static String DirPath;
	public static String MapXML;
	public static String name;
	public static String version;
	public static String obj;
	public static String[] rules;
	
	public XMLCreation() {
		
		//public variable imports from me.Captain_Elliott.XMLcreator.start 
		start start = new start();
		DirPath = start.DirPath;
		MapXML = start.MapXML;
		name = start.name;
		version = start.version;
		obj = start.objective;
		rules = start.rulesArray;
		
		
		
		

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("map");
			doc.appendChild(rootElement);
			
			Attr attr = doc.createAttribute("proto");
			attr.setValue("1.3.2");
			rootElement.setAttributeNode(attr);
			// eName == elementName
			Element eName = doc.createElement("name");
			eName.appendChild(doc.createTextNode(name));
			rootElement.appendChild(eName);
			
			Element eVersion = doc.createElement("version");
			eVersion.appendChild(doc.createTextNode(version));
			rootElement.appendChild(eVersion);
			
			Element eObj = doc.createElement("objective");
			eObj.appendChild(doc.createTextNode(obj));
			rootElement.appendChild(eObj);
			
			Element eRules = doc.createElement("rules");
			rootElement.appendChild(eRules);
			
			/*for(int i = 0; i < rules.length; i++){
				Element eRule = doc.createElement("rule");
				eRule.appendChild(doc.createTextNode(rules[i]));
				eRules.appendChild(eRules);
			}*/
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(DirPath + MapXML));
			
			transformer.transform(source, result);

			
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }

	}

	public static void XMLCreation() {
		// TODO Auto-generated method stub
		
	}

}
