package Model.cards;

import Model.Deck;
import Model.Pawn;

public class NumberSevenCard extends Card{
	
	private int value;
	private String image;
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	public NumberSevenCard(int value) {
		this.value = 7;
	}

	/**
	 * gets image for the Number Two Card
	 */
	public String getImage() {
		return image;
	}

	/**
	 * gets image for the Number Two Card
	 */
    public void setImage(String image) {
    	this.image = image;
	}
   
    /**
     * Accessor: returns the card's value
     * Postcondition: card's value has been returned
     * this method will return int value
     */
    public int getValue() {
    	return value;
	}

    /**
     * Transformer: sets the card's value
     * Postcondition: card's value has been set
     * parameter int value
     */
    public void setValue(int value) {
	}
    
    /**
     * Override: this method will move the pawn 7 moves ahead
     * or if the players chooses to split his moves into 2 moves
     * that'll have a total of 7 moves.
     * Post-Condition: It will be called on the method (view)updatePawn
     */
    

	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		int p = pawn.getPosition();
		if(p != -1) {
			p = p + 7;
			Math.floorMod(p, 72);
			pawn.setPosition(p);
		}
		
	}
}
