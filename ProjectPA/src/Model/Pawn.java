package Model;

public abstract class Pawn {
	
	private String color;
	private boolean isActive, hasFinished;
	
	public Pawn(String color) {
		this.color = color;
		this.isActive = false;
		this.hasFinished = false;
	}
	
	public abstract void init_pawn();
	/**
	 * Transformer: initializes the two pawns of each players. 
	 */
	
	public abstract void setColor(String color);
	/**
	 * Transformer: sets color of one of the player's pawns.
	 */
	
	public abstract String getColor();
	/**
	 * Accessor: returns the color of one of the player's pawns.
	 * Pre-Condition: the color must be setted.
	 */
	
	public abstract boolean isActive();
	/**
	 * if the pawn isActive, meaning if it hasn't reached Home and is out of Start
	 * then it will return true. Otherwise false.
	 */
	
	public abstract boolean hasFinished();
	/**
	 * if the pawn has reached Home, it will return true.
	 * Otherwise false.
	 */
	
	public abstract int squareOfPawn();
	/**
	 * this method will return the square that each pawn is on
	 * it will return an integer because each square in the board will 
	 * be submitted with a number.
	 */
	
}
