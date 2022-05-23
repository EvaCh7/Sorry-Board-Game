package Model.cards;

import Model.Deck;
import Model.Pawn;

public class SorryCard extends Card{
	
	private String image;
	
	/**
	 * gets image for the Sorry Card
	 */
	public String getImage() {
		return image;
	}

	/**
	 * sets image for the Sorry Card
	 */
    public void setImage(String image) {
    	this.image = image;
	}

    /**
     * The result will be true.
     */
	public boolean isSorry() {
		return false;
	} 
	
	/**
	 * The player's pawn will take the place of the opponent's pawn,
	 * and the opponent's pawn will go back to Start.
	 */
	
	@Override
	public void movePawn(Pawn pawn,Deck deck) {
		return;
	}
	
}
