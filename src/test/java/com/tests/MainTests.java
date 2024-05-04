package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.logic.Logic;
import com.model.Player;

public class MainTests {
	
	// Tests for Player health 
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
	
	// Tests for Player Attack and Strength 
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
	
	// Tests for Determining the winner
	@Test
	public void testForWinner() {
		List<String> resultList = new ArrayList<String>();
		resultList.add("Player 1 wins");
		resultList.add("Player 2 wins");
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(100,10,0))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(100,0,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,0,10),new Player(100,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,0),new Player(100,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(100,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(100,5,10))));
		assertTrue(resultList.contains(Logic.play(new Player(100,5,10),new Player(10,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,1),new Player(10,1,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,5),new Player(100,5,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,51,10),new Player(100,10,51))));
		assertTrue(resultList.contains(Logic.play(new Player(500,51,100),new Player(1000,100,51))));
		assertTrue(resultList.contains(Logic.play(new Player(5000,51,100),new Player(1000,100,51))));
	}
	
	// Test For Negative Attributes
	@Test
	public void testforNegativeAttributes() {
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,-5,-10),new Player(-100,-10,-5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,-5,10),new Player(-100,-10,5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,5,10),new Player(-100,10,5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,5,-10),new Player(-100,10,-5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,5,10),new Player(100,10,-5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(50,5,10),new Player(100,-10,5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(50,-5,10),new Player(100,10,5)));
		assertEquals("Attributes can't be negative",Logic.play(new Player(50,5,10),new Player(-100,10,5)));
	}
}
