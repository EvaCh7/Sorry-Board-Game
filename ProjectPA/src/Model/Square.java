package Model;

public abstract class Square {
	
	public abstract void setColor(String color);
	/**
	 * Transformer: sets the card's color
     * Postcondition: card's color has been set
     * parameter-> string color
	 */

	public abstract void getColor();
	/**
	 * Accessor: returns the card's color 
     * Postcondition: card's color has been returned
	 * this method will return the color of each card.
	 */
	
	public abstract boolean hasPawn();
	/**
	 * This method will check if the specific square has a pawn on it
	 * and if it has it will return true, otherwise false.
	 * parameter-> player's pawn
	 */
}
