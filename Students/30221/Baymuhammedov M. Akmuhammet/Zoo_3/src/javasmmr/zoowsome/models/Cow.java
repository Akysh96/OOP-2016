package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Cow extends Mammals {
    public Cow(){
    	super(0.7,0.3);
    	setnrlegs(4);
    	setname("Cow");
    	setbodytemp(100);
    	setfurr(100);
    	setTakencareof(Boolean.FALSE);
    }
    public Cow(int nrlegs, String name, int bodytemp, float furr,double maintenance, double danger,boolean Takencareof){
    	super(maintenance, danger);
    	setnrlegs(nrlegs);
    	setname(name);
    	setbodytemp(bodytemp);
    	setfurr(furr);
    	setTakencareof(Takencareof);
    }
    
    public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
		
	}
}