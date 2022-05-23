package Model;

public abstract class NumberTwoCard extends Card{
	
	private int value;

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
     * @return 
     */
    
    public abstract boolean isAtStart();
    /**
     * Pre-Condition: canMove==true, the player drew the Number Two Card
     * this method will get the player out of the square Start
     */
    
    abstract void PlayAgain();
    /**
     * When the player draws the Number Two Card, the player will play again.
     * Pre-Condition: the player drew the Number Two Card.
     */
    
    abstract void movePawn(int value);
    /**
     * Override: this method will move the pawn 2 moves ahead
     * Pre-Condition: canMove==true(from super)
     */
}
