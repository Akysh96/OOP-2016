package javasmmr.zoowsome.views;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;

public class Insectsview {
	public void Insectsview()throws Exception{
		AnimalFactory factory = new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Insects);
		Ant a = new Ant();
		a.getName();
		a.getNrlegs();
		a.venomous();
		a.canfly();
		System.out.println(" ");
		
		Beetle b = new Beetle();
		b.getName();
		b.getNrlegs();
		b.venomous();
		b.canfly();
		System.out.println(" ");
		
		Cockroach c = new Cockroach();
		c.getName();
		c.getNrlegs();
		c.venomous();
		c.canfly();
		System.out.println(" ");
	}

}
