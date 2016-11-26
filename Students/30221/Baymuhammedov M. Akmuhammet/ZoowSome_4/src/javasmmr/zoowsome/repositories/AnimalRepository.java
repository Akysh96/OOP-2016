package javasmmr.zoowsome.repositories;
import org.w3c.dom.Element;
import javasmmr.zoowsome.models.Animals;
import javasmmr.zoowsome.models.*;
import javasmmr.zoowsome.services.Constants;

public class AnimalRepository extends EntityRepository<Animals>{
	
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
	@Override
	protected Animals getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		
		switch(discriminant){
		case Constants.Animals.Insects.Beetle:
			Animals beetle = new Beetle();
			beetle.decodeFromXml(element);
			return beetle;
			
		case Constants.Animals.Insects.Ant:
			Animals ant = new Ant();
			ant.decodeFromXml(element);
			return ant;
			
		case Constants.Animals.Insects.Cockroach:
			Animals roach = new Cockroach();
			roach.decodeFromXml(element);
			return roach;
			
		case Constants.Animals.Aquatics.Dolphin:
			Animals dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
			
		case Constants.Animals.Aquatics.Shark:
			Animals shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
			
		case Constants.Animals.Aquatics.Whale:
			Animals whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
			
		case Constants.Animals.Reptiles.Chameleon:
			Animals chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;
			
		case Constants.Animals.Reptiles.Lizard:
			Animals lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
			
		case Constants.Animals.Reptiles.Snake:
			Animals snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
			
		case Constants.Animals.Birds.Hawk:
			Animals hawk = new Hawk();
			hawk.decodeFromXml(element);
			return hawk;
			
		case Constants.Animals.Birds.Nightingale:
			Animals nightingale = new Nightingale();
			nightingale.decodeFromXml(element);
			return nightingale;
			
		case Constants.Animals.Birds.Penguin:
			Animals penguin = new Penguin();
			penguin.decodeFromXml(element);
			return penguin;
			
		case Constants.Animals.Mammals.Cow:
			Animals cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
			
		case Constants.Animals.Mammals.Goat:
			Animals goat = new Goat();
			goat.decodeFromXml(element);
			return goat;
			
		case Constants.Animals.Mammals.Panda:
			Animals panda = new Panda();
			panda.decodeFromXml(element);
			return panda;
			
		default:
			break;
		}
		return null;
	}
	
	

}
