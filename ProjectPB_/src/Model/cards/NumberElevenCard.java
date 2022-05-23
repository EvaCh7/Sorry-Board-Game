package Model.cards;

import Model.Deck;
import Model.Pawn;

public class NumberElevenCard extends Card{
	
	private String image;
	private int value;
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */	
	public NumberElevenCard(int value) {
		this.value = 11;
	}

	/**
	 * Accessor: returns the card's image
	 * Precondition: card's image has been setted.
	 * Postcondition: card's image has been returned
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Transformer: sets card's image
	 * PostCondition: card's image has been set.
	 * parameter->String image.
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
     * Pre-Condition: The opponent must not be in safezone, start or home.
     * If the player chooses to switch places with the opponent then this method will be called.
     * @param value
     */
    public void Switch(Pawn p1, Pawn p2) {
	} 
    
    /**
     * Override: this method will move the pawn 11 moves ahead.
     * or switch pawns with the opponents pawn.
     * Post-Condition: it will be called on the method (view)updatePawn
     */

	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		int p = pawn.getPosition();
		if(p != -1) {
			p = p + 11;
			Math.floorMod(p, 72);
			pawn.setPosition(p);
		}
		
	}
}
