package javasmmr.zoowsome.models;

public class Goat extends Mammals{
	public Goat(){
	super(0.5,0.4);
	setnrlegs(4);
	setname("Goat");
	setbodytemp(120);
	setfurr(100);
	}
	
	public Goat(int nrlegs, String name, int bodytemp, float furr, double maintenance, double danger){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
	}
}
