package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Dolphin;
import javasmmr.zoowsome.models.Whale;

public class AquaticFactory extends SpeciesFactory {

	public Animals getAnimal(String type)throws Exception{
		
			if(Constants.Animals.Aquatics.Shark.equals(type))
				return new Shark();
				else
					if(Constants.Animals.Aquatics.Whale.equals(type))
						return new Whale();
					else
						if(Constants.Animals.Aquatics.Dolphin.equals(type))
							return new Dolphin();
						else
					       throw new Exception("Invalid animal exception!");	
	}
}