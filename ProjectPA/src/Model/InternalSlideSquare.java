package Model;

public abstract class InternalSlideSquare extends SlideSquare{
	
	private String image; 

	abstract String getImage();
	/**
	 * Accessor: returns the card's image
	 * Precondition: card's image has been setted.
	 * Postcondition: card's image has been returned
	 */

    abstract void setImage(String image);
    /**
	 * Transformer: sets card's image
	 * PostCondition: card's image has been set.
	 * parameter->String image.
	 */

}
