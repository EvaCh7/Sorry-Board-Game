package Model.square;

import Model.Pawn;

public class HomeSquare extends Square{
	
	private String image;
	
	public String getImage() {
		return image;
	}
	/**
	 * Accessor: returns the card's image
	 * Precondition: card's image has been setted.
	 * Postcondition: card's image has been returned
	 */

    public void setImage(String image) {
    	this.image=image;
    }
    /**
	 * Transformer: sets card's image
	 * PostCondition: card's image has been set.
	 * parameter->String image.
	 */
    
    public boolean hasBothPawns(Pawn p1, Pawn p2, boolean bothP) {
    	if(bothP==true) {
    		return true;
    	}
    	else return false;
    }
    /**
     * Checks if both pawns are on the home square, and if they are then it will return true
     * @param p1
     * @param p2
     * @param bothP
     * @return
     */

}
