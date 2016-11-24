package javasmmr.zoowsome.models;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insects extends Animals {
	private Boolean venomous;
	private Boolean canfly;
	
	public Insects(Double maintenance, Double danger){
		super(maintenance, danger);
	}
	
	public void venomous(){
		System.out.println("Venomous: "+venomous);
	}
	
	public void setvenomous(Boolean venom){
		this.venomous=venom;
	}
	
	public void canfly(){
		System.out.println("Canfly: "+canfly);
	}
	
	public Boolean getCanFly(){
		return this.canfly;
	}
	
	public Boolean getVenomous(){
		return this.venomous;
	}
	
	public void setcanfly(Boolean fly){
		this.canfly=fly;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "CanFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getVenomous()));
	}
	
	public void decodeFromXml(Element element){
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("CanFly").item(0).getTextContent()));
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}

}
