package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Whale extends Aquatic{
	public Whale(){
		super(0.3,0.6);
		setnrlegs(0);
		setname("Whale");
		setdangerous(Boolean.FALSE);
		setswimdepth(1000);
		setTakencareof(Boolean.FALSE);
	}
	public Whale(int nrlegs, String name, Boolean dangerous, int swimdepth,double maintenance,double danger,boolean Takencareof){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setdangerous(dangerous);
		setswimdepth(swimdepth);
		setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);	
	}

}
