package practice13.ptra13;

public class SuperHero extends Hero{

	public SuperHero() {
		super();
	}
	
	private Item equipment;
	
	public int attack() {
		return this.power+additionalDamage;
	}
}
