package javasmmr.zoowsome.views;

import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;

public class Mammalsview {
	public void Mammalsview() throws Throwable {
		AnimalFactory factory = new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Mammals);
		Animals a = species.getAnimal(Constants.Animals.Mammals.Goat);
		Goat g = new Goat();
		a.getName();
		a.getNrlegs();
		g.getbodytemp();
		g.getfurr();
		System.out.println(" ");
		a = species.getAnimal(Constants.Animals.Mammals.Cow);
		Cow c = new Cow();
		a.getName();
		a.getNrlegs();
		c.getbodytemp();
		c.getfurr();
		System.out.println(" ");
		a = species.getAnimal(Constants.Animals.Mammals.Panda);
		Panda p = new Panda();
		a.getName();
		a.getNrlegs();
		p.getbodytemp();
		p.getfurr();
		System.out.println(" ");
	}
}
