package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Snake extends Reptiles{
     public Snake(){
    	 super(0.2,0.9);
    	 setnrlegs(0);
    	 setname("Snake");
    	 setvenomous(Boolean.TRUE);
    	 setcanswim(Boolean.TRUE);
    	 setTakencareof(Boolean.FALSE);
     }
     
     public Snake(int nrlegs, String name, Boolean venomous, Boolean canswim,double maintenance, double danger,boolean Takencareof){
    	 super(maintenance, danger);
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setvenomous(venomous);
    	 setcanswim(canswim);
    	 setTakencareof(Takencareof);
     }
     
     public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
 		super.encodeToXml(eventWriter);
 		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);	
 	}
}
