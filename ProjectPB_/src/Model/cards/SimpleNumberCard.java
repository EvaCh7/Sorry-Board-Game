package Model.cards;

import Model.Deck;
import Model.Pawn;

public class SimpleNumberCard extends Card{
	
	private String image;
	private int value;
	
	
	/**
	 * Constructor of the specific class. Gets the value of the card.
	 * @param value
	 */
	public SimpleNumberCard(int Value) {
		this.value = Value;
		
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
     * Override: this method will move the pawn -based on the number of the card- moves ahead
     * Post-Condition: the method will be called in the (view)updatePawn
     */
    @Override
    public void movePawn(Pawn pawn,Deck deck)
    
    {
    	int p = pawn.getPosition();
		if(p != -1) {
			p = p + this.value;
			Math.floorMod(p, 72);
			pawn.setPosition(p);
		}
	}
    
    

}
