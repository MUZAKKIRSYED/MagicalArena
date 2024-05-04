package com.main;

import com.logic.Logic;
import com.model.Player;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			//Taking Input
			System.out.print("Enter Player 1 Health: ");int player1Health = scan.nextInt();
			System.out.print("Enter Player 1 Strength: ");int player1Strength = scan.nextInt();
			System.out.print("Enter Player 1 Attack: ");int player1Attack = scan.nextInt();
			System.out.print("Enter Player 2 Health: ");int player2Health = scan.nextInt();
			System.out.print("Enter Player 2 Strength: ");int player2Strength = scan.nextInt();
			System.out.print("Enter Player 2 Attack: ");int player2Attack = scan.nextInt();
			
			//Initializing Player Objects 
			Player p1 = new Player(player1Health,player1Strength,player1Attack);
			Player p2 = new Player(player2Health,player2Strength,player2Attack);
			 
			//Checking Negative Integers Condition 
			if(player1Health>=0&&player1Strength>=0&&player1Attack>=0&&player2Health>=0&&player2Strength>=0&&player2Attack>=0) {
				Logic.play(p1, p2);
			}
			else {
				System.out.println("Incorrect Attributes");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
