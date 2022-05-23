package Model.square;

public class EndSlideSquare extends SlideSquare{

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
	
	
    
}
