package Controller;
import Model.Deck;
import Model.Player;
import View.View;

public abstract class Controller {
	
	Deck board;
	View view;
	Player player1;
	Player player2;
	
	public abstract void init();
	/**
	 * Transformer:initializes everything that is needed for the game
	 * cards, board, players, and everyone is ready to play
	 */
	
	public abstract void drawAndRemoveCard();
	/**
	 * Pre-condition: remCards>0
	 * Everytime one of the two players play, they draw a card and the
	 * card is automatically removed from the game.
	 */
	
	public abstract void canMove();
	/**
	 * checks if the card that the player just drew can move to the 
	 * specific position. otherwise (s)he might need to fold.
	 */

	public abstract boolean isGameFinished();
	/**
	 * checks if someone reached both of his/her pawns on the Home Square.
	 * if yes, then it will return true, and the game will pop up
	 * the winner, and the game is automatically over.
	 */
	
	public abstract void main(String[] args);
	/**
	 * creates the controller.
	 */
	
	public abstract boolean newRound();
	/**
	 * Observer: return true if the players want a new round.
	 */
}
