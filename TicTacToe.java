package com.monocept.test;

import java.util.Scanner;

public class TicTacToe {
	//display Play Board
	public static void print(char[][] board) {
		System.out.println(board[0][0]+" | " + board[0][1] + " | " + board[0][2]);
		System.out.println("__ ___ __");
		System.out.println(board[1][0]+" | " + board[1][1] + " | " + board[1][2]);
		System.out.println("__ ___ __");
		System.out.println(board[2][0]+" | " + board[2][1] + " | " + board[2][2]);
	}
	//get Valid Input from Player 
	public static int getCorrectValue(char[][] board, String p) {
		Scanner sc = new Scanner(System.in);
		int value;
		while(true) {
			System.out.print(p + " enter value from 1 to 9: ");
			value = sc.nextInt();
			if (value<1 || value>9) {
				System.out.println("Please enter value between 1 to 9 only");
				continue;
			}
			char curr = board[(value-1)/3][(value-1)%3];
			if (curr == 'X' || curr == 'O') {
				System.out.println("The box is already taken, choose another one");
			}
			else return value-1;
		}
	}
	public static Boolean didPlayerWon(char[][] board, char player) {
		if (board[0][0]==player && board[0][1]==player && board[0][2]==player)  return true;
		else if (board[1][0]==player && board[1][1]==player && board[1][2]==player) return true;
		else if (board[2][0]==player && board[2][1]==player && board[2][2]==player) return true;
		else if (board[0][0]==player && board[1][0]==player && board[2][0]==player) return true;
		else if (board[0][1]==player && board[1][1]==player && board[2][1]==player) return true;
		else if (board[0][2]==player && board[1][2]==player && board[2][2]==player) return true;
		else if (board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
		else if (board[2][0]==player && board[1][1]==player && board[0][2]==player) return true;
		else return false;
	}
	public static void playGame(char[][] board, String p1, String p2) {
		Scanner sc = new Scanner(System.in);
		int index, turn=0;
		print(board);
		while(turn<9) {
			if (turn%2 != 0) {
				index = getCorrectValue(board, p1);
				board[index/3][index%3] = 'X';
				print(board);
				if (didPlayerWon(board, 'X')) {
					System.out.println("Congratualtion " + p1 + ", You won!!");
					return;
				}
			} else {
				index = getCorrectValue(board, p2);
				board[index/3][index%3] = 'O';
				print(board);
				if (didPlayerWon(board, 'O')) {
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
				char x = (char)((i*3+j+1) + '0'); 
				board[i][j] = x; 
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

