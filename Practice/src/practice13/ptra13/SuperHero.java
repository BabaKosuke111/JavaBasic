package practice13.ptra13;

public class SuperHero extends Hero{
	private Item equipment;


	public SuperHero() {
		super();
	}

	public int attack() {
		return this.getPower()+equipment.getAdditionalDamage();
	}

	public Item getEquipment() {
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment=equipment;
	}
}
