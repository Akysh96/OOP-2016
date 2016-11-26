package javasmmr.zoowsome.models;
import java.util.Random;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animals implements Killer, XML_Parsable{
	private Integer nrlegs;
	private String name;
	private Boolean Takencareof;
	public double maintenancecost;
	public double Dangerperc;
	
	public Animals(double maintenance, double Danger){
		this.maintenancecost=maintenance;
		this.Dangerperc=Danger;
	}
	
	public void setMaintenanceCost(double maintenanceCost){
		   this.maintenancecost=maintenanceCost;
		}
		
	public void getNrlegs(){
		System.out.println("Has number of legs: "+nrlegs);
	}
	
	public void setnrlegs(Integer nrlegs){
		this.nrlegs=nrlegs;
	}
	
	public String getName(){
		System.out.println("Name: "+name);
		return name;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public double getmaintenance(){
		return maintenancecost;
	}
	
	
	
	public double getDangerperc(){
		return Dangerperc;
	}
	
	public boolean getTakencareof(){
		return Takencareof;
	}
	
	public void setTakencareof(boolean takencare){
		this.Takencareof=takencare;
	}
	
	public void setDangerPerc(double DangerPerc){
		this.Dangerperc=DangerPerc;
	}
	
	public boolean kill(){
		Random rand = new Random();
		double r = rand.nextDouble();
		if(r < Dangerperc)
			return true;
			else
			 return false;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrlegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenancecost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.Dangerperc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.Takencareof));
		
	}
	
	public void decodeFromXml(Element element){
		setnrlegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setname(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakencareof(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}

