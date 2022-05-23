package Model;

public abstract class Deck {
	
	private boolean endOfCards, fold;
	
	public Deck() {
		this.endOfCards = false;
		this.fold = false;
	}
	
	public abstract Card init_Cards();
	/**
	 * cards will be initialized in this method.
	 */
	
	public abstract void Board();
	/**
	 * board will be initialized in this method.
	 */
	
	public abstract Pawn init_Pawns();
	/**
	 * pawns will be initialized in this method.
	 */
	
	public abstract void newCards();
	/**
	 * Precondition: wasPlayed()==false
	 * With this method the player will draw new cards, since as the game
	 * continues, the cards that have been drawn will be "removed" from
	 * being drawn again.
	 */
	
	public abstract boolean wasPlayed();
	/**
	 * checks if the card has been drawn before - for every single one 
	 * of the cards-. if it has, then it returns true, otherwise false. 
	 */
	
	public abstract int remCards();
	/**
	 * while return>0 there are remaining cards. if return==0, then 
	 * the game will automatically shuffle all the cards.
	 */
	
	public abstract void movePawn();
	/**
	 * this method will move a player's pawn based on the card that he drew.
	 */
	
	public abstract boolean canFold(boolean fold);
	/**
	 * if the player can not make any moves, then the only choice the player
	 * has is to press fold, and he'll give his turn to the opponent.
	 */
}
