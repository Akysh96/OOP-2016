package javasmmr.zoowsome.views;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.*;

public class Reptilesview {
   public void Reptilesview() throws Throwable{
	   AnimalFactory Factory = new AnimalFactory();
	   SpeciesFactory Species = Factory.getSpeciesFactory(Constants.Species.Reptiles);
	   Animals a=Species.getAnimal(Constants.Animals.Reptiles.Chameleon);
	   a.getName();
	   a.getNrlegs();
	   Chameleon c = new Chameleon();
	   c.canswim();
	   c.venomous();
	   System.out.println(" ");
	   a=Species.getAnimal(Constants.Animals.Reptiles.Lizard);
	   a.getName();
	   a.getNrlegs();
	   Lizard l = new Lizard();
	   l.canswim();
	   l.venomous();
	   System.out.println(" ");
	   a=Species.getAnimal(Constants.Animals.Reptiles.Snake);
	   a.getName();
	   a.getNrlegs();
	   Snake s = new Snake();
	   s.canswim();
	   s.venomous();
	   System.out.println(" ");
   }
}
