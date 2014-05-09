package ocnxmlgen.src;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class writeXML {
	
	public writeXML(){
		
	}
	
	private void XMLcreation()
			throws ParserConfigurationException,
			TransformerFactoryConfigurationError,
			IOException, TransformerException {
		//DocumentBuilderFactory
		DocumentBuilderFactory docFactory= DocumentBuilderFactory.newInstance();
		//DocumentBuilder
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		//Document
		Document xmlDoc = docBuilder.newDocument();
				
		//Build XML elements and text nodes
		Element rootElement = xmlDoc.createElement("map");
		rootElement.setAttribute("proto", "1.3.2");
		
		Element authors = xmlDoc.createElement("authors");
		Element author = xmlDoc.createElement("author");
		Text authorNameText = xmlDoc.createTextNode("Timothee38");
		
		xmlDoc.appendChild(rootElement);
		rootElement.appendChild(authors);
		authors.appendChild(author);
		author.appendChild(authorNameText);
		
		//Set Output Format
		/*OutputFormat outFormat = new OutputFormat(xmlDoc);
		outFormat.setIndenting(true);*/
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(xmlDoc);
		File xmlFile = new File("map1.xml");
		StreamResult result = new StreamResult(new FileWriter(xmlFile));
		transformer.transform(source, result);
		System.out.println("Wrote: " + xmlFile.getAbsolutePath());
	}
	
	public static void main(String[] args){
		writeXML writeXML = new writeXML();
		try {
			writeXML.XMLcreation();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
