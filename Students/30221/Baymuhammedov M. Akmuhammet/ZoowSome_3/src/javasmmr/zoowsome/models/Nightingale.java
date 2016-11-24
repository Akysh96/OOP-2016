package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Nightingale extends Bird {
	public Nightingale(){
		super(0.2,0.0);
		setnrlegs(2);
		setname("Nightingale");
		setflight(1000);
		setTakencareof(Boolean.FALSE);
	}
	
	public Nightingale(int nrlegs, String name, Integer flightability,double maintenance,double danger,boolean Takencareof){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setflight(flightability);
		setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Nightingale);
		
	}
}
