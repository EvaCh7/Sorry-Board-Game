package View;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

import Model.Card;

public abstract class View extends JFrame{
	 private JButton[] playerCards = new JButton[44];
	 private JButton playerLastCard = new JButton();
	 private JLabel[] positions;
	 private JLayeredPane basic_panel;
	 private JLayeredPane player1;
	 JLabel pawn;
	 JTextArea infobox;
	 int option; 
	 String strin;
	 ClassLoader cldr = this.getClass().getClassLoader();  
	   
	 public void MenuDialog(Object a,Object b,String str,String str2){

	 }
	 /**
	  * Creates a new Menu Window 
	  */
     
	 public abstract int choice();
	 /**
  	  * Accessor:Returns the choice of a player
	  * @return the choice of the player
	  */
	    
	 
	 public abstract void updateCard(Card c, int position);
	 /**
	  * For every card that has been drawn, it will be appeared 
	  * next to the pile of cards, and this will show which card 
	  * was the last one.
	  */
	 
	 public abstract void init_Cards(ArrayList<Card> cards);
	 /**
	  * every card will be initialized in this method.
	  */
	 
	 public abstract void updatePawn(int position);
	 /**
	  * every time the pawn moves to a new position the method
	  * will be updated.
	  */
	 
	 public abstract void updateInfoBox(String message);
	 /**
	  * below the cards, there is an information box that appears
	  * a message saying whose turn it is and how many
	  * cards there are left.
	  */
	 
	 public abstract void showWinMess(String message);
	 /**
	  * this method will appear a message saying who won
	  * after the game is finished.
	  */
	 
	 public View() {
	 }
	 /**
	  * Constructor
	  */
	 
	 
}
