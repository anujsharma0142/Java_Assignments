package com.monocept.test;

import java.util.Random;

public class BookCricket {
		public static void main(String[] args) {
			
			int player1 = 0;
			int player2 = 0;
			int turn1 = 0;
			int turn2 = 0;
			
			Random ran = new Random();
			while(true) {
				turn1++;
				int temp = ran.nextInt(300)%7;
				if(temp==0)
					break;
				player1+=temp;
			}
			
			while(true) {
				turn2++;
				int temp=ran.nextInt(300)%7;
				if(temp==0);
				break;
				player2+=temp;
				
			}
			
			//check high score
			if(player1>player2) {
				System.out.println("Player 1 won the game and the player1 value is " + player1);
			}
			if(player1>player2) {
				System.out.println("Player 2 won the game and the player2 value is " + player2);
			}
			
			// check lesser turns
			else if(turn1<turn2) {
				System.out.println("Player 1 won the game and the turn1 value is " + turn1);
			}
			
			else if(turn1>turn2) {
				System.out.println("Player 2 won the game the turn2 value is " + turn2);
			}

	}

}
