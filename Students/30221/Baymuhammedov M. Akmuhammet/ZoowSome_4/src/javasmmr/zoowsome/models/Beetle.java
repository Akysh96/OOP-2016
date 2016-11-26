package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Beetle extends Insects{
	public Beetle(){
		super(0.3,0.2);
		setnrlegs(6);
		setname("Beetle");
		setvenomous(Boolean.FALSE);
		setcanfly(Boolean.TRUE);
		setTakencareof(Boolean.FALSE);
	}
	
	public Beetle(int nrlegs, String name, Boolean venomous, Boolean canfly, double maintenance, double danger,boolean Takencareof){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
		setcanfly(canfly);
		setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Beetle);
	}
}
