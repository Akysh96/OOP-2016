package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animals;

public abstract class SpeciesFactory {
	public abstract Animals getAnimal(String type) throws Throwable;
}