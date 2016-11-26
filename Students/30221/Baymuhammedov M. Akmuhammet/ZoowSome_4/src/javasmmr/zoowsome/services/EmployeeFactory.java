package javasmmr.zoowsome.services;
import javasmmr.zoowsome.employees.*;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Throwable;
}

