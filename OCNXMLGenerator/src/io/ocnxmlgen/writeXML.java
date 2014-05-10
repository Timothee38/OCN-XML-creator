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

	public static void writeXML() throws ParserConfigurationException,
			TransformerException, SAXException, IOException {
		String filepath = "C:\\Users\\Elliott\\Desktop\\map.xml";
		// DocumentBuilderFactory
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		// DocumentBuilder
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		// Document
		Document xmlDoc = docBuilder.newDocument();

		// Build XML elements and text nodes
		Element rootElement = xmlDoc.createElement("map");
		rootElement.setAttribute("proto", mapProto.proto); // map proto that has
													// been entered by
													// the user

		Element name = xmlDoc.createElement("name");
		Text nameText = xmlDoc.createTextNode(mapName.name);
		
		Element obj = xmlDoc.createElement("objective");
		Text objText = xmlDoc.createTextNode(mapObjective.obj);
	
		Element authors = xmlDoc.createElement("authors");
		Element author = xmlDoc.createElement("author");
		Text authorNameText = xmlDoc.createTextNode("Timothee38");
		


		xmlDoc.appendChild(rootElement);
		rootElement.appendChild(authors);
		authors.appendChild(author);
		author.appendChild(authorNameText);
		rootElement.appendChild(name);
		name.appendChild(nameText);
		rootElement.appendChild(obj);
		obj.appendChild(objText);

		// Set Output Format
		/*
		 * OutputFormat outFormat = new OutputFormat(xmlDoc);
		 * outFormat.setIndenting(true);
		 */
		

		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(xmlDoc);
		StreamResult result = new StreamResult(new File(filepath));
		transformer.transform(source, result);

		System.out.println("Done");

	}

	public static void main(String[] args) {

	}
}
