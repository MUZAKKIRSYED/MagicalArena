package com.logic;

import java.util.Random;
import com.model.Player;
import java.util.ArrayList;
import java.util.List;

public class Logic {

	public static String play(Player Player1, Player player2) {
		try {
			// Checking the values of Health to determine Winner
			if (Player1.getHealth() == 0 && player2.getHealth() == 0) {
				return "No Health to start the game";
			} else if (Player1.getHealth() == 0) {
				return "Player 2 wins";
			} else if (player2.getHealth() == 0) {
				return "Player 1 wins";
			}

			// Checking the Values of Attack and Health
			List<Integer> list = new ArrayList<Integer>();
			list.add(Player1.getAttack());
			list.add(Player1.getStrength());
			list.add(player2.getAttack());
			list.add(player2.getStrength());
			int zeroCount = 0;
			for (int i = 0; i < 4; i++) {
				if (list.get(i) == 0) {
					zeroCount++;
				}
			}

			if (zeroCount > 1) {
				return "Improper Attributes to Play";
			}

			// Checking Negative Integers Condition and proceed with the Game
			if (Player1.getHealth() >= 0 && Player1.getStrength() >= 0 && Player1.getAttack() >= 0
					&& player2.getHealth() >= 0 && player2.getStrength() >= 0 && player2.getAttack() >= 0) {
				String resultCheck = "continue";
				boolean condition = true;
				resultCheck = check(Player1, player2);
				if (Player1.getHealth() > player2.getHealth()) {
					playing(Player1, player2);
					condition = false;
				} else if (Player1.getHealth() < player2.getHealth()) {
					playing(player2, Player1);
				}
				resultCheck = check(Player1, player2);
				while (resultCheck == "continue") {
					if (condition == true) {
						playing(Player1, player2);
						condition = false;
					} else {
						playing(player2, Player1);
						condition = true;
					}
					resultCheck = check(Player1, player2);
				}
				return resultCheck;
			} else {
				return "Attributes can't be negative";
			}
		} catch (Exception e) {
			return "" + e;
		}
	}

	// Actual Method of Game Implementation
	public static void playing(Player player1, Player player2) {
		Random random = new Random();
		int attackingDie = random.nextInt(6) + 1;
		int defendingDie = random.nextInt(6) + 1;
		int attackingScore = player2.getAttack() * attackingDie;
		int defendingScore = player1.getStrength() * defendingDie;
		if (attackingScore > defendingScore) {
			int resultScore = player1.getHealth() - (attackingScore - defendingScore);
			player1.setHealth(resultScore);
		}
	}

	// Method to check the Status of Health of Players
	public static String check(Player player1, Player player2) {
		if (player1.getHealth() <= 0) {
			return "Player 2 wins";
		} else if (player2.getHealth() <= 0) {
			return "Player 1 wins";
		}
		return "continue";
	}

}
