package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Controller.Controller;
import Model.Deck;
import Model.cards.Card;
import Model.cards.NumberFourCard;
import Model.cards.NumberOneCard;
import Model.cards.NumberSevenCard;
import Model.cards.NumberTwoCard;
import Model.cards.SimpleNumberCard;

class JUnitTest {

	Controller c=new Controller();
	
	@Test
	void tests() {
		Card c1 = new Card();
		Deck d = c.getDeck();
		c1 = new NumberOneCard(1);
		c1.movePawn(d.getPawnR1(), d);
		assertEquals(10, d.getPawnR1().getPosition());
		Card c2 = new Card();
		c2 = new NumberTwoCard(2);
		c2.movePawn(d.getPawnY1(), d);
		assertEquals(46, d.getPawnY1().getPosition());
		Card c3 = new Card();
		c3 = new NumberSevenCard(7);
		c3.movePawn(d.getPawnR1(), d);
		assertEquals(17, d.getPawnR1().getPosition());
		Card c4 = new Card();
		c4 = new NumberFourCard(4);
		c4.movePawn(d.getPawnR1(), d);
		assertEquals(13, d.getPawnR1().getPosition());
		Card c5 = new Card();
		c5 = new SimpleNumberCard(5);
		c5.movePawn(d.getPawnY1(), d);
		assertEquals(51, d.getPawnY1().getPosition());
		Card c6 = new Card();
		c6 = new SimpleNumberCard(5);
		c6.movePawn(d.getPawnY2(), d);
		assertEquals(-1, d.getPawnY2().getPosition());
	}

}
