package Model;

import java.util.ArrayList;

//import model.Card;

public abstract class Player {
	
	private String name; //the name of each player.
	private String color; //the color of the player's pawns.
	private boolean played;
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Player(String name, String color) {
		this.name = name;
		this.color = color;
		this.cards = new ArrayList<Card>();
		this.played = false;
	}
	/**
	 * This is the constructor. The player has an unique name and color. 
	 * the other player can not have the same name or color.
	 * hasPlayed,submitted->checks if the player has played or submitted
	 * his move, so that the other player knows when is his/her turn.
	 */
	
	public abstract void init_player(); 
	/**
	 * Transformer: initializes each player.
	 */
	
	public abstract void setName(String Name);
	/**
	 * Transformer:sets name of the player
	 */
	
	public abstract String getName();
	/**
	 * Accessor: returns name of the player.
	 */
	
	public abstract void setColor(String color);
	/**
	 * Transformer:sets color of the player's pawns.
	 */
	
	public abstract String getColor();
	/**
	 * Accessor:returns color of the player's pawns.
	 */
	
	public abstract Card cards();
	/**
	 * returns the cards that the player can draw.
	 */
	
	public abstract boolean played();
	/**
	 * after the player has completed his move, only then it's the other player's turn
	 */

}
