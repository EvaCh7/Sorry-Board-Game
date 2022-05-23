package Model.cards;

import Model.Deck;
import Model.Pawn;

public  class Card {
    static int value;
    String image;

    public String getImage() {
        return image;
    }
    

    public void setImage(String image) {
        this.image = image;
    }
   
    /**
     * Accessor: returns the card's value
     * Postcondition: card's value has been returned
     * this method will return the value of each card.
     * @param value
     */
    public int getValue() {
        return value;
    }

    /**
     * Transformer: sets the card's value
     * Postcondition: card's value has been set
     * parameter int value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Pre-Condition: the pawn can make the move
     * if the move is allowed, then the player's pawn will move to the specific position.
     * parameter-> Player's pawn, board.
     */
    
	 public  void movePawn(Pawn pawn,Deck deck ) {} 

}