package javasmmr.zoowsome.repositories;
import org.w3c.dom.Element;
import javasmmr.zoowsome.employees.*;
import javasmmr.zoowsome.services.Constants;

public class EmployeeRepository extends EntityRepository<Employee>{
	private static final String XML_FILENAME = "Employee.xml";
	public EmployeeRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}
	
	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		
		switch(discriminant){
		case Constants.Employee.Caretakers:
			Employee caretaker = new Caretaker();
			caretaker.decodeFromXml(element);
			return caretaker;
			
		default:
			break;
		}
		return null;
	}
	

}
