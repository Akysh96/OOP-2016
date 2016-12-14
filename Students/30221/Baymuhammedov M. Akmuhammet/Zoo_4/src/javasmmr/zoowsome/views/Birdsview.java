package javasmmr.zoowsome.views;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;

public class Birdsview {
	public void Birdsview() throws Throwable{
		AnimalFactory factory = new AnimalFactory();
		SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Birds);
		Animals a = species.getAnimal(Constants.Animals.Birds.Hawk);
		a.getName();
		a.getNrlegs();
		Hawk h = new Hawk();
		h.printflight();
		System.out.println(" ");
		Nightingale n = new Nightingale();
		n.getName();
		n.getNrlegs();
		n.printflight();
		System.out.println(" ");
		Penguin p = new Penguin();
		p.getName();
		p.getNrlegs();
		p.printflight();
		System.out.println(" ");
		}

}
