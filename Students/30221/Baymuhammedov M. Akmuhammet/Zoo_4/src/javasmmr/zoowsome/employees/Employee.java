package javasmmr.zoowsome.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable{
	private String name;
	private Long id;
	private Integer Salary;
	private Boolean isDead;
	
	public Employee(String name, Long id, Integer Salary, Boolean isDead){
		this.name=name;
		this.id=id;
		this.Salary=Salary;
		this.isDead=isDead;
	}
	
	public Employee(){
		
		
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
		
	}
	
	public Long getid(){
		return id;
	}
	
	public void setid(Long id){
		this.id=id;
	}
	
	public Integer getSalary(){
		return Salary;
	}
	
	public void setSalary(Integer salary){
		this.Salary=salary;
	}
	
	public Boolean getisDead(){
		return isDead;
	}
	
	public void setisDead(boolean isdead){
		this.isDead=isdead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter)throws XMLStreamException{
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.Salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		
	}
	
	public void decodeFromXml(Element element){
		setname(element.getElementsByTagName("name").item(0).getTextContent());
		setid(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setSalary(Integer.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
		setisDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}

}
