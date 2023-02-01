package com.monocept.test;

import java.util.Scanner;

public class TicTacToe {

	public static void print(char[][] board) {
		System.out.println(board[0][0]+" | " + board[0][1] + " | " + board[0][2]);
		System.out.println("__ ___ __");
		System.out.println(board[1][0]+" | " + board[1][1] + " | " + board[1][2]);
		System.out.println("__ ___ __");
		System.out.println(board[2][0]+" | " + board[2][1] + " | " + board[2][2]);
	}
	
	public static Boolean didPlayerWon(char[][] board, char player) {
		return true;
	}
	
	public static void playGame(char[][] board, String p1, String p2) {
		Scanner sc = new Scanner(System.in);
		int index, turn=0;
		while(turn<9) {
			if (turn%2 != 0) {
				System.out.print(p1 + " enter value from 1 to 9");
				index = sc.nextInt();
				board[(index-1)/3][(index-1)%3] = 'X';
				if (didPlayerWon(board, 'X')) {
					System.out.println("Congratualtion " + p1 + ", You won!!");
					return;
				}
			} else {
				System.out.print(p2 + " enter value from 1 to 9");
				index = sc.nextInt();
				board[(index-1)/3][(index-1)%3] = 'O';
				if (didPlayerWon(board, 'X')) {
					System.out.println("Congratualtion " + p2 + ", You won!!");
					return;
				}
			}
			turn += 1;
		}
		System.out.println("----------!Game Tie---------");
	}
	
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = ' '; 
			}
		}
		Scanner sc = new Scanner(System.in);
		String player1, player2;
		System.out.print("Player one enter you name: ");
		player1 = sc.nextLine();
		System.out.print("Player two enter you name: ");
		player2 = sc.nextLine();
		System.out.println("------------ Welcome to Tic Tac Toe, Lets start -----------");
		playGame(board, player1, player2);
	}

}
