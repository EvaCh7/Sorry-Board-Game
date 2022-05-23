package Model;

public abstract class SimpleNumberCard extends Card{
	
	private String image;
	
	abstract String getImage();
	/**
	 * gets image for the Number Two Card
	 */

    abstract void setImage(String image);
    /**
	 * gets image for the Number Two Card
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
    
    abstract void movePawn();
    /**
     * Override: this method will move the pawn -based on the number of the card- moves ahead
     * Pre-Condition: canMove==true(from super)
     */

}
