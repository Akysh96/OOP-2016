package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Panda extends Mammals{
	public Panda(){
		super(0.6,0.4);
		setnrlegs(4);
		setname("Panda");
		setbodytemp(140);
		setfurr(100);
		setTakencareof(Boolean.FALSE);
	}
	public Panda(int nrlegs, String name, int bodytemp, int furr,double maintenance,double danger,boolean Takencareof){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
		setTakencareof(Takencareof);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Panda);
	}
}
