package javasmmr.zoowsome.employees;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	private Double workingHours;
	
	public Caretaker(String name, Long id, Integer Salary, Boolean isDead, Double workingHours){
		super(name,id,Salary,isDead);
		setname(name);
		this.workingHours=workingHours;
	}
	
	public Caretaker(){
		
		
		
	}
	
	public Double getworkinghours(){
		return workingHours;
	}
	
	public void setworkinghours(double workingHours){
		this.workingHours=workingHours;
	}
	

	public String Takecareof(Animals a){
		if(a.kill()){
			return Constants.Employee.Caretaker.TCO_Killed;
		}
		if(this.workingHours<a.getmaintenance()){
			return Constants.Employee.Caretaker.TCO_No_time;
		}
		
		a.setTakencareof(Boolean.TRUE);
		this.workingHours=this.workingHours - a.maintenancecost;
		
		return Constants.Employee.Caretaker.TCO_Succes;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));	
	}
	
	public void decodeFromXml(Element element){
		setworkinghours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}

}
