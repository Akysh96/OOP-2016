package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.Beetle;
import javasmmr.zoowsome.models.Ant;
import javasmmr.zoowsome.models.Cockroach;

public class InsectFactory extends SpeciesFactory{
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animals.Insects.Beetle.equals(type)){
			return new Beetle();
		}
		else
			if(Constants.Animals.Insects.Ant.equals(type)){
				return new Ant();
			}
			else
				if(Constants.Animals.Insects.Cockroach.equals(type)){
					return new Cockroach();
				}
				else
					throw new Exception("Error");
	}

}
