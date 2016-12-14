package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Cockroach extends Insects{
	public Cockroach(){
		super(0.2,0.0);
		setnrlegs(6);
		setname("Cockroach");
		setvenomous(Boolean.FALSE);
	    setcanfly(Boolean.FALSE);
	    setTakencareof(Boolean.FALSE);
	}
	public Cockroach(int nrlegs, String name, Boolean venomous, Boolean canfly, double maintenance, double danger, boolean Takencareof){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setvenomous(venomous);
	    setcanfly(canfly);
	    setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
		
	}
}
