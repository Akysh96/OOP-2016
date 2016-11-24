package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Lizard extends Reptiles{
    public Lizard(){
    	super(0.2,0.6);
    	setnrlegs(4);
    	setname("Lizard");
    	setvenomous(Boolean.FALSE);
    	setcanswim(Boolean.FALSE);
    	setTakencareof(Boolean.FALSE);
    }
    
    public Lizard(int nrlegs, String name, Boolean venomous, Boolean canswim,double maintenance, double danger,boolean Takencareof){
    	super(maintenance,danger);
    	setnrlegs(nrlegs);
    	setname(name);
        setvenomous(venomous);
        setcanswim(canswim);
        setTakencareof(Takencareof);
    }
    
    public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizard);
		
	}
}
