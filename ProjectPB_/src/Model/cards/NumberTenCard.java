package Model.cards;

import Model.Deck;
import Model.Pawn;

public class NumberTenCard extends Card{
	
	private int value;
	private String image;
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	public NumberTenCard(int value) {
		this.value = 10;
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
     * Override: this method will move the pawn 10 moves ahead
     * Post-Condition: this method will be called on the (view)updatePawn.
     * If the move is not allowed, then his pawn will move 1 move behind.
     */

	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		int p = pawn.getPosition();
		if(p != -1) {
			p = p + 10;
			Math.floorMod(p, 72);
			pawn.setPosition(p);
		}
		
		if(deck.getPawnR1().getPosition() == deck.getPawnR2().getPosition()) {
			
		}
		
	}
}
