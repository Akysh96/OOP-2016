package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptiles extends Animals{
   private Boolean venomous;
   private Boolean canswim;
   
   public Reptiles(double maintenance, double danger){
	   super(maintenance, danger);
   }
   
   public void venomous(){
	   System.out.println("Venomous: "+venomous);
   }
   
   public void setvenomous(Boolean venom){
	   this.venomous=venom;
   }
   
   public void canswim(){
	   System.out.println("Can swim: "+canswim);
   }
   
   public Boolean getVenomous(){
	   return this.venomous;
   }
   
   public Boolean getCanSwim(){
	   return this.canswim;
   }
   
   public void setcanswim(Boolean swim){
	   this.canswim=swim;
   }
   
   public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canSwim", String.valueOf(getCanSwim()));
		createNode(eventWriter, "isDangerous", String.valueOf(getVenomous()));
		
	}
 
   public void decodeFromXml(Element element){
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("canSwim").item(0).getTextContent()));
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
  
}
