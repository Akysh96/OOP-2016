package javasmmr.zoowsome.views;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;

public class Aquaticsview {
   public void Aquaticsview() throws Throwable{
	   AnimalFactory factory = new AnimalFactory();
	   SpeciesFactory species = factory.getSpeciesFactory(Constants.Species.Aquatics);
	   Animals a=species.getAnimal(Constants.Animals.Aquatics.Shark);
	   a.getName();
	   a.getNrlegs();
	   Shark s=new Shark();
	   s.dangerous();
	   s.swimdepth();
	   System.out.println(" ");
	   a=species.getAnimal(Constants.Animals.Aquatics.Dolphin);
	   a.getName();
	   a.getNrlegs();
	   Dolphin d = new Dolphin();
	   d.dangerous();
	   d.swimdepth();
	   System.out.println(" ");
	   a=species.getAnimal(Constants.Animals.Aquatics.Whale);
	   a.getName();
	   a.getNrlegs();
	  Whale w = new Whale();
	  w.dangerous();
	  w.swimdepth();
	  System.out.println(" ");
   }
}
