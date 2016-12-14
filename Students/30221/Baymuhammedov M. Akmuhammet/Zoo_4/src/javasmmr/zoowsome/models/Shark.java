package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Shark extends Aquatic{
     public Shark(){
    	 super(0.6,1.0);
    	 setnrlegs(0);
    	 setname("Shark");
    	 setdangerous(Boolean.TRUE);
    	 setswimdepth(1000);
    	 setTakencareof(Boolean.FALSE);
     }
     
     public Shark(int nrlegs, String name, Boolean dangerous, int swimdepth, double maintenance, double danger,boolean Takencareof){
    	 super(maintenance, danger);
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setdangerous(dangerous);
    	 setswimdepth(swimdepth);
    	 setTakencareof(Takencareof);
     }
     
     public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
 		super.encodeToXml(eventWriter);
 		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);	
 	}
}
