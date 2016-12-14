package javasmmr.zoowsome.services;
import javasmmr.zoowsome.employees.*;

public class CaretakerFactory extends EmployeeFactory{
   public Employee getEmployee(String type)throws Exception{
	   if(Constants.Employee.Caretakers.equals(type)){
		   return new Caretaker();
	   }
	   else
		   throw new Exception("Doesn't exist!");
   }
}
