package Model;

public abstract class NumberOneCard extends Card{
	
	private int value;
	private String image;
	
	abstract String getImage();
	/**
	 * gets image for the Number One Card
	 */

    abstract void setImage(String image);
    /**
	 * gets image for the Number One Card
	 */
   
    public abstract int getValue();
    /**
     * Accessor: returns the card's value
     * Post-Condition: card's value has been returned
     * this method will return int value
     */

    public abstract void setValue(int value);
    /**
     * Transformer: sets the card's value
     * Post-Condition: card's value has been set
     * parameter int value
     * @return 
     */
    
    public abstract boolean isAtStart();
    
    /**
     * Pre-Condition: canMove==true, the player drew the Number One Card
     * this method will get the player out of the square Start
     */
    
    abstract void movePawn(int value);
    /**
     * Override: this method will move the pawn 1 move ahead
     * Pre-Condition: canMove==true(from super)
     */
}
