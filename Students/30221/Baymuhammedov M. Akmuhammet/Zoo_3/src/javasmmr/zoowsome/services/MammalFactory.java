package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.Goat;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Panda;

public class MammalFactory extends SpeciesFactory{
	public Animals getAnimal(String type)throws Exception{
		
		if(Constants.Animals.Mammals.Goat.equals(type)){
			return new Goat();
		}
		else
			if(Constants.Animals.Mammals.Cow.equals(type)){
				return new Cow();
			}
			else
				if(Constants.Animals.Mammals.Panda.equals(type)){
					return new Panda();
				}
			else
			throw new Exception("Error!");
	}

}
