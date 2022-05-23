package Model.cards;

import Model.Deck;
import Model.Pawn;

public class NumberFourCard extends Card{
	
	private int value;
	private String image;
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	
	public NumberFourCard(int value) {
		this.value = 4;
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
     * Override: this method will move the pawn 4 moves behind.
     * Post-Condition: it will be called on the method (view)updatePawn
     */

	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		int p = pawn.getPosition();
		if(p != -1) {
			p = p - 4;
			Math.floorMod(p, 72);
			pawn.setPosition(p);
		}
		
	}
}
