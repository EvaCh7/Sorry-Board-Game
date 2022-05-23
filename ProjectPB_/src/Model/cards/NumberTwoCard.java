package Model.cards;

import Controller.Controller;
import Model.Deck;
import Model.Pawn;

public class NumberTwoCard extends Card{
	
	private int value;
	private String image;
	
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	
	public NumberTwoCard(int value) {
		this.value = 2;
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
     * @return 
     */
    public void setValue(int value) {
	}
    
    
    /**
     * When the player draws the Number Two Card, the player will play again.
     * Pre-Condition: the player drew the Number Two Card.
     */
    void PlayAgain() {
	}
    
    
    /**
     * Override: this method will move the pawn 2 moves ahead
     * Post-Condition: this method will be called in the (view)updatePawn.
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
			p = p + 2;
		}
		Math.floorMod(p, 72);
		pawn.setPosition(p);
		
		
	}
}
