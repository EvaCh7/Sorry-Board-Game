package Model;

public abstract class SorryCard extends Card{
	
	private String image;
	
	abstract String getImage();
	/**
	 * gets image for the Number Two Card
	 */

    abstract void setImage(String image);
    /**
	 * gets image for the Number Two Card
	 */

	public abstract boolean isSorry(); 
	/**
	 * The result will be true.
	 */
	
	public abstract boolean isAtStart();
	/**
	 * this method will return true if the player is at the start square
	 * and false if he isn't. 
	 * @return
	 */
	
	public abstract void movePawn();
	/**
	 * The player's pawn will take the place of the opponent's pawn,
	 * and the opponent's pawn will go back to Start.
	 */
	
}
