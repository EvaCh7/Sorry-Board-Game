package Model;

public abstract class NumberElevenCard extends Card{
	
	private int value;
	private String image;

	abstract String getImage();
	/**
	 * Accessor: returns the card's image
	 * Precondition: card's image has been setted.
	 * Postcondition: card's image has been returned
	 */

    abstract void setImage(String image);
    /**
	 * Transformer: sets card's image
	 * PostCondition: card's image has been set.
	 * parameter->String image.
	 */
   
    public abstract int getValue();
    /**
     * Accessor: returns the card's value
     * Postcondition: card's value has been returned
     * this method will return int value
     */

    public abstract void setValue(int value);
    /**
     * Transformer: sets the card's value
     * Postcondition: card's value has been set
     * parameter int value
     */
    
    public abstract void Switch(); 
    /**
     * Pre-Condition: The opponent must not be in safezone, start or home.
     * If the player chooses to switch places with the opponent then this method will be called.
     * @param value
     */
    
    abstract void movePawn(int value);
    /**
     * Override: this method will move the pawn 11 moves ahead.
     * or switch pawns with the opponents pawn.
     * Pre-Condition: canMove==true(from super)
     */
}
