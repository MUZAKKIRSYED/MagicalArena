package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.logic.Logic;
import com.model.Player;

public class MainTests {

	@Test
	public void testsForZeroHealth() {
		assertEquals("No Health to start the game",Logic.play(new Player(0,0,0),new Player(0,0,0)));
		assertEquals("No Health to start the game",Logic.play(new Player(0,10,0),new Player(0,10,0)));
		assertEquals("Player 2 wins",Logic.play(new Player(0,10,0),new Player(10,10,0)));
		assertEquals("Player 1 wins",Logic.play(new Player(10,10,0),new Player(0,10,0)));
		assertEquals("No Health to start the game",Logic.play(new Player(0,10,10),new Player(0,10,10)));
		assertEquals("No Health to start the game",Logic.play(new Player(0,0,10),new Player(0,0,10)));
		assertEquals("No Health to start the game",Logic.play(new Player(0,10,10),new Player(0,0,10)));
		assertEquals("No Health to start the game",Logic.play(new Player(0,10,0),new Player(0,10,10)));
	}
	@Test
	public void testForZeroValueAttributes() {
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,0),new Player(10,0,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,0),new Player(10,10,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,10,0),new Player(10,0,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,0),new Player(10,10,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,10,0),new Player(10,0,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,10),new Player(10,0,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,10,0),new Player(10,10,0)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,10),new Player(10,0,10)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,10,0),new Player(10,0,10)));
		assertEquals("Improper Attributes to Play",Logic.play(new Player(100,0,10),new Player(10,10,0)));
	}
}
