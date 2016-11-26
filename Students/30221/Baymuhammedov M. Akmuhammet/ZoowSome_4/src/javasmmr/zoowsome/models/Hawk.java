 package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Hawk extends Bird{
  public Hawk(){
	super(0.4,0.7);
	setnrlegs(2);
	setname("Hawk");
	setflight(10000);
	setTakencareof(Boolean.FALSE);
}

  public Hawk(int nrlegs, String name, Integer flightability, double maintenance, double danger,boolean Takencareof){
	super(maintenance,danger);
	setnrlegs(nrlegs);
	setname(name);
	setflight(flightability);
	setTakencareof(Takencareof);
}
  
  public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Hawk);
		
	}
}
