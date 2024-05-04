package com.main;

import com.logic.Logic;
import com.model.Player;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("Enter Player 1 Health: ");int player1Health = scan.nextInt();
			System.out.print("Enter Player 1 Strength: ");int player1Strength = scan.nextInt();
			System.out.print("Enter Player 1 Attack: ");int player1Attack = scan.nextInt();
			System.out.print("Enter Player 2 Health: ");int player2Health = scan.nextInt();
			System.out.print("Enter Player 2 Strength: ");int player2Strength = scan.nextInt();
			System.out.print("Enter Player 2 Attack: ");int player2Attack = scan.nextInt();
			
			//Initializing Player Objects 
			Player p1 = new Player(player1Health,player1Strength,player1Attack);
			Player p2 = new Player(player2Health,player2Strength,player2Attack);
			System.out.println(Logic.play(p1,p2));
		}
		catch(Exception e) {System.out.println(e);}
	}
}
