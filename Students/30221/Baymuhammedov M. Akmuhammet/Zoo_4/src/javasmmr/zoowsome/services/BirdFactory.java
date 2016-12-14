package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.Nightingale;
import javasmmr.zoowsome.models.Penguin;
import javasmmr.zoowsome.models.Hawk;

public class BirdFactory extends SpeciesFactory{
	
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animals.Birds.Nightingale.equals(type)){
			return new Nightingale();
		}
		else
			if(Constants.Animals.Birds.Penguin.equals(type)){
				return new Penguin();
			}
			else
				if(Constants.Animals.Birds.Hawk.equals(type)){
					return new Hawk();
				}
				else
			throw new Exception("Error!");
	}

}
