package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animals {
    private Integer flightability;
    
    public Bird(double maintenance, double danger){
    	super(maintenance, danger);
    }
    
    public void printflight(){
    	System.out.println("flight attitude is "+flightability);
    	
    }
    
    public Integer getFlight(){
    	return this.flightability;
    }
    
    public void setflight(Integer flight){
    	this.flightability = flight;
    }
    
    public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "flightAttitude", String.valueOf(getFlight()));
		
	}
    
    public void decodeFromXml(Element element){
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("flightAttitude").item(0).getTextContent()));
	}
    
}
