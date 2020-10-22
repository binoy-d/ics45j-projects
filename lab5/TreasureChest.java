package labs.lab5;

public class TreasureChest implements GameElement{
	
	private double weight;
	
	// constructor that initializes this TreasureChest with the given weight
	public TreasureChest(double weight) {
		this.weight = weight;
	}
	
	// returns the weight of this TreasureChest
	public double getWeight() {
		return weight;
	}
	
	// decreases the weight of this TreasureChest by 5%
	public void tick() {
		weight*=0.95;
	}
}
