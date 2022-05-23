package Model;

import java.util.ArrayList;

import Model.cards.Card;

//import model.Card;

public class Player {
	
	private String name; //the name of each player.
	private String color; //the color of the player's pawns.
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	/**
	 * This is the constructor. The player has an unique name and color. 
	 * the other player can not have the same name or color.
	 * hasPlayed,submitted->checks if the player has played or submitted
	 * his move, so that the other player knows when is his/her turn.
	 */
	public Player() { //(String name, String color)
		this.name = getName();
		this.color = getColor();
	}
	
	/**
	 * Transformer: initializes each player.
	 */
	public void init_player() {
	} 
	
	/**
	 * Transformer:sets name of the player
	 */
	public void setName(String Name) {
	}
	
	/**
	 * Accessor: returns name of the player.
	 */
	public String getName() {
		return null;
	}
	
	/**
	 * Transformer:sets color of the player's pawns.
	 */
	public void setColor(String color) {
	}
	
	/**
	 * Accessor:returns color of the player's pawns.
	 */
	public String getColor() {
		return null;
	}

}
