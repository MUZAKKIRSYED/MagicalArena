package com.logic;

import java.util.Random;
import com.model.Player;

import java.util.ArrayList;
import java.util.List;

public class Logic {

	public static String play(Player p1,Player p2) {
		try{
			// Checking the values of Health to determine Winner
			if(p1.getHealth()==0 && p2.getHealth()==0) {
				return "No Health to start the game";
			}
			else if(p1.getHealth()==0) {
				return "Player 2 wins";
			}
			else if(p2.getHealth()==0) {
				return "Player 1 wins";
			}
			
			//Checking the Values of Attack and Health
			List<Integer> list = new ArrayList<Integer>();
			list.add(p1.getAttack());list.add(p1.getStrength());list.add(p2.getAttack());list.add(p2.getStrength());
			int zeroCount=0;
			for(int i=0;i<4;i++) {
				if(list.get(i)==0) {
					zeroCount++;
				}
			}
			
			if(zeroCount>1) {
				return "Improper Attributes to Play";
			}
			
			//Checking Negative Integers Condition and proceed with the Game 
			if(p1.getHealth()>=0&&p1.getStrength()>=0&&p1.getAttack()>=0&&p2.getHealth()>=0&&p2.getStrength()>=0&&p2.getAttack()>=0) {
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
						System.out.println("p2 attack");
						condition=false;
					}
					else {
						playing(p2,p1);
						System.out.println("p1 attack");
						condition=true;
					}
					resultCheck = check(p1, p2);
				}
				return resultCheck;
			}
			else {
				return "Attributes can't be negative";
			}
		}
		catch(Exception e) {
			return ""+e;
		}
	}
	
	// Actual Method of Game Format
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
		System.out.println(attackingDie+" " +defendingDie+" "+attackingScore+" " +defendingScore+p1.getHealth()+" "+p2.getHealth());
	}
	
	// Method to check the Status of Health of Players 
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
