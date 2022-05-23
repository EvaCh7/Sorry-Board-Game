package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Model.Deck;
import Model.Player;
import Model.cards.Card;
import View.View;

public class Controller {

	Deck deck;
	static View view;
	Player player1;
	Player player2;
	ArrayList<Card> gameCards = new ArrayList<Card>();
	int i = 0;
	Card c ;
	boolean redTurn = true;
	boolean cardDr = true;

	/**
	 * Constructor of the Controller. Every method that will be used for the Controller's methods 
	 * must be called in the constructor. 
	 */
	public Controller() {
		view = new View();
		deck = new Deck();
		view.initView();
		setListeners();
		gameCards = deck.getCards();
		deck.initCards(gameCards);
		view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + deck.remCards(gameCards));
	
	}
	
	public Deck getDeck() {
		return deck;
	}
	
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public static void main(String[] args) {
		Controller c = new Controller();
		c.init();
	}
	
	/**
	 * Pre-Condition: setters and getters for each button must be created in the View class
	 * every button must have a Listener, in order to take some actions when the player 
	 * presses the specific button. 
	 * Post-Condition: each Listener must have its own class.(implements MouseListener)
	 */

	public void setListeners() {
		view.getButton().addMouseListener(new CardListener());
		view.getPawnR1().addMouseListener(new PawnListener());
		view.getPawnR2().addMouseListener(new PawnListener());
		view.getPawnY1().addMouseListener(new PawnListener());
		view.getPawnY2().addMouseListener(new PawnListener());
		view.getFold().addMouseListener(new FoldListener());
	}
	
	/**
	 * Pre-Condition: setListener for the fold button.
	 * this is the class for the FoldButton. When the player presses the fold button, the other player's turn is on
	 * and the game continues. 
	 * @author evach
	 *
	 */
	private class FoldListener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {
			if (SwingUtilities.isLeftMouseButton(e)) {
				if(cardDr==false) {
					if(redTurn == false) {
						redTurn = true;
						cardDr=true;
						view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
					} else if(redTurn == true) {
						redTurn = false;
						cardDr=true;
						view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
					}
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	/**
	 * Pre-Condition: setListeners for the buttons, and also the player must have drawn a card.
	 * This is the class for the pawns' buttons. When the player presses a button of his/her pawns
	 * the pawn will move to the specific position in the board(based on the card that he/she drew)
	 * and the other player's turn will come up.
	 * @author evach
	 *
	 */

	private class PawnListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if (SwingUtilities.isLeftMouseButton(e)) {
				int v = c.getValue();
				JButton button = ((JButton) e.getSource());
				
				if(cardDr == false) {
					if(redTurn == true) {
						if(button == view.getPawnR1()) {
							c.movePawn(deck.getPawnR1(),deck);
							redTurn=false;
							cardDr=true;
							view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
						}
						if(button == view.getPawnR2()) {
							c.movePawn(deck.getPawnR2(),deck);
							redTurn=false;
							cardDr=true;
							view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
						}
					}
					else if(redTurn == false) {
						if(button == view.getPawnY1()) {
							c.movePawn(deck.getPawnY1(),deck);
							redTurn=true;
							cardDr=true;
							view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
						}
						if(button == view.getPawnY2()) {
							c.movePawn(deck.getPawnY2(),deck);
							redTurn=true;
							cardDr=true;
							view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
						}
					}
				}
				
			view.updatePawn(deck.getPawnR1().getPosition(), deck.getPawnR2().getPosition(), deck.getPawnY1().getPosition(), deck.getPawnY2().getPosition());
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	/**
	 * Pre-Condition: setListener for the cards, and the cards must be initialized 
	 * This is the class for the cards' button. When the player presses the left button
	 * (that shows the back of the card), he/she draws a card and the card will be appeared
	 * in the right button. 
	 * @author evach
	 *
	 */
	private class CardListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if (SwingUtilities.isLeftMouseButton(e)) {
				if(cardDr == true) {
					c = deck.drawCard(gameCards, i);
					cardDr=false;
					view.updateCard(c, i);
					gameCards.remove(i);
					if(gameCards.size()==0) {
						view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size() + "\n\n The cards "
								+ "will shuffle now.\n New stack of cards with 44 Cards!");
					} else {
						view.updateInfobox("Info Box.\n\nTurn: " + Turn(redTurn) + "\nCards Left: " + gameCards.size());
					}
				}
			}
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

	}
	
	/**
	 * Transformer:initializes everything that is needed for the game cards, board,
	 * players, and everyone is ready to play
	 */

	public void init() {
		player1 = new Player();
		player2 = new Player();
		deck = new Deck();
	}
	
	/**
	 * Checks if the game is finished. if both of the player's pawns are on the home square, then the 
	 * specific player has won the game.
	 * @return
	 */
	public boolean isGameFinished() {
		if(deck.getPawnR1().getPosition() == 8 && deck.getPawnR2().getPosition() == 8) {
			view.updateInfobox("THE WINNER IS THE PLAYER WITH THE RED PAWNS!!");
			return true;
		}
		else if(deck.getPawnY1().getPosition() == 44 && deck.getPawnY2().getPosition() == 44) {
			view.updateInfobox("THE WINNER IS THE PLAYER WITH THE RED PAWNS!!");
			return true;
		} else return false;
		
	}
	
	/**
	 * </b>Pre-Condition:</b> a boolean must be initialized, and the fold button too, so that when the player
	 * 						presses the fold button, it changes turns
	 * This method will be used for the infobox. Takes as a parameter a boolean variable turn
	 * and when it's true, it's player 1(Which is the one with the red pawns)'s turn.
	 * otherwise, it's player 2(Which is the player with the yellow pawns)'s turn.
	 * </b>Post-Condition: </b> This method will be used for the infobox, and for the pawns that can be pressed.
	 * @param turn
	 * @return
	 */
	
	public String Turn(boolean turn) {
		if(turn == true) {
			return "Player 1(Red)";
		} else return "Player 2(Yellow)";
	}
	
}
