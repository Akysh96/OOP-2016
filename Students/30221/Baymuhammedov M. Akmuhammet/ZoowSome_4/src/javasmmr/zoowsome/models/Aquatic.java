package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animals {
    private Boolean dangerous;
    private Integer swimdepth;
    
    public Aquatic(double maintenance, double danger){
    	super(maintenance, danger);
    }
    
    public void dangerous(){
    	System.out.println("Dangerous: "+dangerous);
    }
    
    public void setdangerous(Boolean danger){
    	this.dangerous=danger;
    }
    
    public void swimdepth(){
    	System.out.println("Swim depth: "+swimdepth);
    }
    
    public void setswimdepth(Integer depth){
    	this.swimdepth=depth;
    }
    
    public Integer getSwimDepth(){
    	return this.swimdepth;
    }
    
    public Boolean getDangerous(){
    	return this.dangerous;
    }
    
    
    
    public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "swimDepth", String.valueOf(getSwimDepth()));
		createNode(eventWriter, "isDangerous", String.valueOf(getDangerous()));
		
	}
    
    public void decodeFromXml(Element element){
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("swimDepth").item(0).getTextContent()));
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
