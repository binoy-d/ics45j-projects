package labs.lab5;

public class PotOfGold implements GameElement{
	
	private int numPieces;
	
	// constructor that initializes this PotOfGold with the given number of gold pieces
	public PotOfGold(int numPieces) {
		this.numPieces = numPieces;
	}
	
	// returns the number of gold pieces in this PotOfGold
	public int getNumPieces() {
		return numPieces;
	}
	
	// increments the number of gold pieces in this PotOfGold by 1
	public void tick() {
		numPieces++;
	}
}
