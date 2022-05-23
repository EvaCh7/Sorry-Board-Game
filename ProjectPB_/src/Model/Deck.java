package Model;

import java.util.ArrayList;
import java.util.Collections;
import Model.cards.Card;
import Model.cards.NumberElevenCard;
import Model.cards.NumberFourCard;
import Model.cards.NumberOneCard;
import Model.cards.NumberSevenCard;
import Model.cards.NumberTenCard;
import Model.cards.NumberTwoCard;
import Model.cards.SimpleNumberCard;
import Model.cards.SorryCard;


public class Deck {
	
	int i = 0;
	ArrayList<Card> cards = new ArrayList<Card>();
	
	Card curCard = new Card();
	Pawn PawnR1 = new Pawn("Red");
	Pawn PawnR2 = new Pawn("Red");
	Pawn PawnY1 = new Pawn("Yellow");
	Pawn PawnY2 = new Pawn("Yellow");
	
	/**
	 * Constructor of the deck class
	 */
	public Deck() {
	}
	
	/**
	 * Setters and getters for each pawn(R1,R2,Y1,Y2) 
	 * these methods will be used for the mouseListeners in the Controller class
	 * @return pawn(R1,R2,Y1,Y2)
	 */
	
	public Pawn getPawnR1() {
		return PawnR1;
	}

	public void setPawnR1(Pawn pawnR1) {
		PawnR1 = pawnR1;
	}

	public Pawn getPawnR2() {
		return PawnR2;
	}

	public void setPawnR2(Pawn pawnR2) {
		PawnR2 = pawnR2;
	}

	public Pawn getPawnY1() {
		return PawnY1;
	}

	public void setPawnY1(Pawn pawnY1) {
		PawnY1 = pawnY1;
	}

	public Pawn getPawnY2() {
		return PawnY2;
	}

	public void setPawnY2(Pawn pawnY2) {
		PawnY2 = pawnY2;
	}
	
	/**
	 * in this method the cards will be initialized and be "saved" in an arraylist.
	 * This arraylist will have the total of the 44 cards, and the player will draw from this stack
	 * of cards everytime he/she presses the left button.
	 * @param cards
	 */

	public void initCards(ArrayList<Card> cards) {
		 for(int i = 0; i < 4; i++) {
			 cards.add(i, new NumberOneCard(1));
			 cards.get(i).setImage("src/images/cards/card1.png");
			 
		 }
		 for(int i = 4; i < 8; i++) {
			 cards.add(i, new NumberTwoCard(2));
			 cards.get(i).setImage("src/images/cards/card2.png");
			
		 }
		 for(int i = 8; i < 12; i++) {
			 cards.add(i, new NumberFourCard(4));
			 cards.get(i).setImage("src/images/cards/card4.png");
			
		 }
		 for(int i = 12; i < 16; i++) {
			 cards.add(i, new NumberSevenCard(7));
			 cards.get(i).setImage("src/images/cards/card7.png");
			
		 }
		 for(int i = 16; i < 20; i++) {
			 cards.add(i, new NumberTenCard(10));
			 cards.get(i).setImage("src/images/cards/card10.png");
			 
		 }
		 for(int i = 20; i < 24; i++) {
			 cards.add(i, new NumberElevenCard(11));
			 cards.get(i).setImage("src/images/cards/card11.png");
			
		 }
		 for(int i = 24; i < 28; i++) {
			 cards.add(i, new SorryCard());
			 cards.get(i).setImage("src/images/cards/cardsorry.png");
			 
		 }
		 for(int i = 28; i < 32; i++) {
			 cards.add(i, new SimpleNumberCard(3));
			 cards.get(i).setImage("src/images/cards/card3.png");
			 
		 }
		 for(int i = 32; i < 36; i++) {
			 cards.add(i, new SimpleNumberCard(5));
			 cards.get(i).setImage("src/images/cards/card5.png");
			 
		 }
		 for(int i = 36; i < 40; i++) {
			 cards.add(i, new SimpleNumberCard(8));
			 cards.get(i).setImage("src/images/cards/card8.png");
			 
		 }
		 for(int i = 40; i < 44; i++) {
			 cards.add(i, new SimpleNumberCard(12));
			 cards.get(i).setImage("src/images/cards/card12.png");
			 
		 }
		 Collections.shuffle(cards);
	 }
	
	/**
	 * Pre-Condition: the ArrayList cards is already initialized.
	 * This method is called everytime the player presses the button to get a card. 
	 * Also checks if all of the cards have been drawn, and initializes them from the start.
	 * @param cards
	 * @param i
	 * @return
	 */
	
	public Card drawCard(ArrayList<Card> cards, int i) {
		if(cards.size()==0) {
			i = 0;
			initCards(cards);
		  	Collections.shuffle(cards);
		}
		curCard = cards.get(i);
		return cards.get(i);
	}
	
	/**
	 * setter and getter for the card that is currently drawn from the player.
	 * In the Controller class the method will access this setter and getter in order to 
	 * show the card that was drawn.
	 * @return
	 */
	
	public Card getCurCard() {
		return curCard;
	}

	public void setCurCard(Card curCard) {
		this.curCard = curCard;
	}
	
	/**
	 * this method gets the arraylist of the card
	 * @return
	 */

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Pre-Condition: cards must be initialized.
	 * while return>0 there are remaining cards. if return==0, then 
	 * the game will automatically shuffle all the cards.
	 * @return number of cards that are left.
	 */
		
	public int remCards(ArrayList<Card> cards) {
		return cards.size();
	}
	
	/**
	 * Checks if the pawns are on the same square. if they are then the move will not be allowed
	 * since the pawns must be in different squares. 
	 * @param pawnr1
	 * @param pawnr2
	 * @param pawny1
	 * @param pawny2
	 */
	
	public void checkForSameSquare(Pawn pawnr1, Pawn pawnr2, Pawn pawny1, Pawn pawny2) {
		if(pawnr1.getPosition()==pawnr2.getPosition()){
		}
		if(pawnr1.getPosition()==pawny1.getPosition()){
		}
		if(pawnr1.getPosition()==pawny2.getPosition()){
		}
		if(pawny1.getPosition()==pawnr2.getPosition()){
		}
		if(pawny1.getPosition()==pawny2.getPosition()){
		}
		if(pawny2.getPosition()==pawnr2.getPosition()){
		}
	}
}
