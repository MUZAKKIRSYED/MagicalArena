package com.logic;

import java.util.Random;
import com.model.Player;

public class Logic {
	
	public static String play(Player p1,Player p2) {
		String resultCheck = "continue";
		boolean condition = true;
		resultCheck = check(p1, p2);
		if(p1.getHealth()>p2.getHealth()){
			playing(p1, p2);
			condition = false;
		}
		else if(p1.getHealth()<p2.getHealth()){
			playing(p2, p1);
		}
		resultCheck = check(p1, p2);
		while(resultCheck=="continue") {		
			if(condition==true) {
				playing(p1,p2);
				condition=false;
			}
			else {
				playing(p2,p1);
				condition=true;
			}
			resultCheck = check(p1, p2);
		}
		return resultCheck;
	}
	public static void playing(Player p1,Player p2) {
		Random random = new Random();
		int attackingDie = random.nextInt(6)+1;
		int defendingDie = random.nextInt(6)+1;
		int attackingScore = p2.getAttack()*attackingDie;
		int defendingScore = p1.getStrength()*defendingDie;
		if(attackingScore>defendingScore) {
			int resultScore = p1.getHealth()-(attackingScore-defendingScore);
			p1.setHealth(resultScore);
		}
	}
	public static String check(Player p1,Player p2) {
		if(p1.getHealth()<=0) {
			return "Player 2 wins";
		}
		else if(p2.getHealth()<=0) {
			return "Player 1 wins";
		}
		return "continue";
	}
	
}
