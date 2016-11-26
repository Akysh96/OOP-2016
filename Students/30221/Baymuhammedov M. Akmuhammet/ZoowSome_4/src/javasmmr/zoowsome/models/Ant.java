package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.Constants;

public class Ant extends Insects{
   public Ant(){
	   super(0.5, 0.1);
	   setnrlegs(6);
	   setname("Ant");
	   setvenomous(Boolean.FALSE);
	   setcanfly(Boolean.FALSE);
	   setTakencareof(Boolean.FALSE);
	   
   }
   
   public Ant(int nrlegs, String name, Boolean venomous, Boolean canfly, Double maintenance, Double danger,Boolean Takencareof){
	   super(maintenance, danger);
	   setnrlegs(nrlegs);
	   setname(name);
	   setvenomous(venomous);
	   setcanfly(canfly);
	   setTakencareof(Takencareof);
   }
   
   public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Ant);
		
	}


}
