package Model.cards;

import Model.Deck;
import Model.Pawn;

public class NumberOneCard extends Card{
	
	private int value;
	private String image;
	
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	public NumberOneCard(int value) {
		this.value = 1;
	}
	
	/**
	 * gets image for the Number One Card
	 */
	public String getImage() {
		return image;
	}

	/**
	 * gets image for the Number One Card
	 */
    public void setImage(String image) {
    	this.image = image;
	}
   
    /**
     * Accessor: returns the card's value
     * Post-Condition: card's value has been returned
     * this method will return int value
     */
    public int getValue() {
    	return value;
	}

    /**
     * Transformer: sets the card's value
     * Post-Condition: card's value has been set
     * parameter int value
     * @return 
     */
    public void setValue(int value) {
	}
    
    /**
     * Override: this method will move the pawn 1 move ahead
     * Post-Condition: it will be called on the method (view)updatePawn
     */

	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		int p = pawn.getPosition();
		if(p == -1) {
			if(pawn.getColor().equals("Red")) {
				p = 10;
			} else {
				p = 46;
				
			}
		} else {
			p = p + 1;
		}
		Math.floorMod(p, 72);
		pawn.setPosition(p);
		
	}
}
