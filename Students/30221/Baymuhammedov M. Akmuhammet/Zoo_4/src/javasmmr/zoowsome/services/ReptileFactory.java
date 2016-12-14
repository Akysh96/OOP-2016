package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.Lizard;
import javasmmr.zoowsome.models.Snake;
import javasmmr.zoowsome.models.Chameleon;

public class ReptileFactory extends SpeciesFactory {

	public Animals getAnimal(String type)throws Exception{
		
			if(Constants.Animals.Reptiles.Lizard.equals(type))
				return new Lizard();
				else
					if(Constants.Animals.Reptiles.Snake.equals(type))
						return new Snake();
					else
						if(Constants.Animals.Reptiles.Chameleon.equals(type))
							return new Chameleon();
					throw new Exception("Invalid animal exception!");	
	}
}