package javasmmr.zoowsome.repositories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.Constants;

public class AnimalRepository {
	
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository(){
		
	}
	
	public void save(ArrayList <Animals> animals) throws FileNotFoundException, XMLStreamException{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for(XML_Parsable animal : animals){
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			
			animal.encodeToXml(eventWriter);
			
			EndElement eElement = eventFactory.createEndElement("",  "",Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value)throws XMLStreamException{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		StartElement sElement = eventFactory.createStartElement("",  "",  name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("",  "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
	
	public ArrayList<Animals> load()throws ParserConfigurationException, SAXException, IOException{
		
		ArrayList<Animals> animals = new ArrayList<Animals>();
		
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int i=0; i<nodeList.getLength();i++){
			Node node = nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				
				switch(discriminant){
				case Constants.Animals.Insects.Beetle:
					Animals beetle = new Beetle();
					beetle.decodeFromXml(element);
					animals.add(beetle);
					
				case Constants.Animals.Insects.Ant:
					Animals ant = new Ant();
					ant.decodeFromXml(element);
					animals.add(ant);
					
				case Constants.Animals.Insects.Cockroach:
					Animals roach = new Cockroach();
					roach.decodeFromXml(element);
					animals.add(roach);
					
				case Constants.Animals.Aquatics.Dolphin:
					Animals dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					
				case Constants.Animals.Aquatics.Shark:
					Animals shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
					
				case Constants.Animals.Aquatics.Whale:
					Animals whale = new Whale();
					whale.decodeFromXml(element);
					animals.add(whale);
					
				case Constants.Animals.Reptiles.Chameleon:
					Animals chameleon = new Chameleon();
					chameleon.decodeFromXml(element);
					animals.add(chameleon);
					
				case Constants.Animals.Reptiles.Lizard:
					Animals lizard = new Lizard();
					lizard.decodeFromXml(element);
					animals.add(lizard);
					
				case Constants.Animals.Reptiles.Snake:
					Animals snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
					
				case Constants.Animals.Birds.Hawk:
					Animals hawk = new Hawk();
					hawk.decodeFromXml(element);
					animals.add(hawk);
					
				case Constants.Animals.Birds.Nightingale:
					Animals nightingale = new Nightingale();
					nightingale.decodeFromXml(element);
					animals.add(nightingale);
					
				case Constants.Animals.Birds.Penguin:
					Animals penguin = new Penguin();
					penguin.decodeFromXml(element);
					animals.add(penguin);
					
				case Constants.Animals.Mammals.Cow:
					Animals cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
					
				case Constants.Animals.Mammals.Goat:
					Animals goat = new Goat();
					goat.decodeFromXml(element);
					animals.add(goat);
					
				case Constants.Animals.Mammals.Panda:
					Animals panda = new Panda();
					panda.decodeFromXml(element);
					animals.add(panda);
					
				default:
					break;
				}
			}
		}
		
		return animals;
		
		
	}

}
