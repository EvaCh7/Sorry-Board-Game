package Model;

public abstract class Card{
	
	public abstract int getValue(); 
	/**
	 * Accessor: returns the card's value
     * Postcondition: card's value has been returned
	 * this method will return the value of each card.
	 * @param value
	 */
	
	public abstract void setValue(int value);
	/**
	 * Transformer: sets the card's value
     * Postcondition: card's value has been set
     * parameter int value
	 */
	
	public abstract String toString(); 
	/**
	 * this method will appear a string that will explain to the player the moves he can make 
	 * for the specific card that he drew.
	 * @return String
	 */
	
	public abstract boolean isAtStart();
	/**
	 * this method will return true if the player is at the start square
	 * and false if he isn't. 
	 * @return
	 */
	
	public abstract boolean isSafe();
	/**
	 * this method will return true if the player is at the safe zone
	 * and false if he isn't. 
	 * @return
	 */
	
	public abstract boolean isSorry();
	/**
	 * this method will return true if the player drew a Sorry! card
	 * and false if he didn't. If he drew the Sorry! card, we will access the 
	 * SorryCard subclass.
	 */
	
	
	abstract void movePawn(); 
	/**
	 * Pre-Condition: the pawn can make the move(the method canMove==true)
	 * if the move is allowed, then the player's pawn will move to the specific position.
	 * parameter-> Player's pawn, board.
	 */
	
	abstract boolean canMove();
	/**
	 * parameter-> Player's pawn
	 * Checks if the move is allowed.
	 */
}
