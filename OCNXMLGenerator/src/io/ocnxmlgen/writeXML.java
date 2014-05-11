package io.ocnxmlgen;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import io.ocnxmlgen.mainMapElements.*;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import io.ocnxmlgen.*;

public class writeXML {
	

	public static void  writeXML() throws ParserConfigurationException,
			TransformerException {

		// DocumentBuilderFactory
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		// DocumentBuilder
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		// Document
		Document xmlDoc = docBuilder.newDocument();

		// Build XML elements and text nodes
		Element rootElement = xmlDoc.createElement("map");
		rootElement.setAttribute("proto", mapProto.proto); 
		xmlDoc.appendChild(rootElement);
		
		Element name = xmlDoc.createElement("name");
		Text nameText = xmlDoc.createTextNode(mapName.name);
		rootElement.appendChild(name);
		name.appendChild(nameText);
		
		Element version = xmlDoc.createElement("version");
		Text versionText = xmlDoc.createTextNode(mapVersion.version);
		rootElement.appendChild(version);
		version.appendChild(versionText); 
		
		Element obj = xmlDoc.createElement("objective");
		Text objText = xmlDoc.createTextNode(mapObjective.obj);
		rootElement.appendChild(obj);
		obj.appendChild(objText);
	
		Element authors = xmlDoc.createElement("authors");
		Element author = xmlDoc.createElement("author");
		Text authorNameText = xmlDoc.createTextNode("Timothee38");
		rootElement.appendChild(authors);
		authors.appendChild(author);
		author.appendChild(authorNameText);
		





		
		// Set Output Format
		/*
		 * OutputFormat outFormat = new OutputFormat(xmlDoc);
		 * outFormat.setIndenting(true);
		 */
		

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(xmlDoc);
		StreamResult result = new StreamResult(new File(FilePath.xmlFilePath + "\\map.xml"));
		 
		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);
		 
		transformer.transform(source, result);
		 
		System.out.println("File saved!");

	}

	public static void main(String[] args) {
		
	}
}
