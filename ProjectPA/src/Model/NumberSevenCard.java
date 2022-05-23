package Model;

public abstract class NumberSevenCard extends Card{
	
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
     */
    
    abstract void movePawn(int value);
    /**
     * Override: this method will move the pawn 7 moves ahead
     * or if the players chooses to split his moves into 2 moves
     * that'll have a total of 7 moves.
     * Pre-Condition: canMove==true(from super)
     */
    
    public abstract void Split(int value);
    /**
     * Pre-Condition: the moves are allowed 
     * if the player chooses to split his moves, he will be able to 
     * make 1 move with each pawn, that their total moves will be 7.
     */
}
