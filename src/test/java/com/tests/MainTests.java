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
	public void testsForStartMethod() {
		List<String> resultList = new ArrayList<String>();
		resultList.add("Player 1 wins");
		resultList.add("Player 2 wins");
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(0,0,0),new Player(0,0,0)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(0,10,0),new Player(0,10,0)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(0,10,0),new Player(10,10,0)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(100,0,0),new Player(10,0,0)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(0,10,10),new Player(0,10,10)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(100,0,0),new Player(10,10,0)));
		assertEquals("Incorrect Attributes to Play",Logic.play(new Player(100,10,0),new Player(10,10,0)));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(1000,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(1000,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(1000,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(1000,10,5))));
		assertTrue(resultList.contains(Logic.play(new Player(50,5,10),new Player(1000,10,5))));
		assertEquals("Attributes can't be negative",Logic.play(new Player(-50,5,10),new Player(100,10,5)));
	}
}
