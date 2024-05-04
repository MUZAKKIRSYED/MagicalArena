package com.main;

import com.logic.Logic;
import com.model.Player;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Player p1 = new Player(50,5,10);
		Player p2 = new Player(100,10,5);
		Logic.play(p1, p2);
	}
}
