package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammals extends Animals{
	protected int bodytemp;
	protected float furr;
	
	public Mammals(double maintenance, double danger){
		super(maintenance, danger);
	}
	
	public void getbodytemp(){
		System.out.println("Has a body temperature of: "+bodytemp);;
	}
	
	public void setbodytemp(int bodytemp){
		this.bodytemp=bodytemp;
	}
	
	public int getBodyTemp(){
		return this.bodytemp;
	}
	
	public float getFurr(){
		return this.furr;
	}
	
	public void getfurr(){
		System.out.println("Has furr on it's "+furr+" body");
	}
	
	public void setfurr(float furr){
		this.furr=furr;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "furrPerc", String.valueOf(getFurr()));
		createNode(eventWriter, "bodyTemp", String.valueOf(getBodyTemp()));
		
	}
	
	public void decodeFromXml(Element element){
	    setTakencareof(Boolean.valueOf(element.getElementsByTagName("furrPerc").item(0).getTextContent()));
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("bodyTemp").item(0).getTextContent()));
	}

}
