package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Goat extends Mammals{
	public Goat(){
	super(0.5,0.4);
	setnrlegs(4);
	setname("Goat");
	setbodytemp(120);
	setfurr(100);
	setTakencareof(Boolean.FALSE);
	}
	
	public Goat(int nrlegs, String name, int bodytemp, float furr, double maintenance, double danger,boolean Takencareof){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
		setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Goat);	
	}
}
