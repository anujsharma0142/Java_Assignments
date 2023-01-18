package com.monocept.test;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {
		public static void main(String[] args) {
			
			while(true) {
				Scanner input = new Scanner(System.in);
				int score1 = 0;
				int score2 = 0;
				int turn1 = 0;
				int turn2 = 0;
				
				System.out.println("For start press 1 and for end press 0 : ");
				int x = input.nextInt();
				if(x==0)
					break;
				input.nextLine();
				System.out.println("Name for player 1 : ");
				String st1 = input.nextLine();
				
				System.out.println("Name for player 2: ");
				String st2 = input.nextLine();
				
				System.out.println("Player : " + st1);
				
				Random var  = new Random();
				while(true) {
					System.out.println("Enter 1 for open Book : ");
					int data = input.nextInt();
					if(data==0) break;
					else {
						int temp = var.nextInt(300);
						turn1++;
						int rem = temp%7;
						score1 += rem;
						System.out.println("Page Number : " + temp +  temp%7  + " ");
						System.out.println("Score : " + score1 );
						if(rem ==0) break;
					}
					
				}
				
				System.out.println("Player1 "+ " Total Score : " + score1 );
				System.out.println("Player1 "+ "Takes " + turn1 + "Rounds ");
				System.out.println("Neeeds "+ score1+1 + "Score in "+ turn1 + "Rounds to Winn Match");
				
				System.out.println("Player : " + st2);
				
				int flag = turn1;
				while(true) {
					System.out.println("Open book for press 1 :");
					int data = input.nextInt();
					if(data==0) break;
					else {
						int temp = var.nextInt(300);
						int rem = temp%7;
						score2 += rem;
						flag--;
						turn2++;
						System.out.println("Page No- " + temp + " ");
						System.out.println("Points : " + temp%7 + " ");
						score2+=temp%7;
						System.out.println("Score : " + score2 + " ");
						System.out.println("Remaining Rounds : " + flag);
						
						if(flag == 0 && score1>score2) {
							System.out.println(st1 + "Winn the Match ");
							break;
						}
						if(score2>score1) {
							System.out.println(st2 + " Win the Match");
							break;
						}
						
						else if(score2 == score1) {
							if(turn1>turn2) {
							System.out.println(st2 + "Win Match");
							break;
							}
							else if(turn1<turn2) {
								System.out.println(st1 + "Win Match");
								break;
							}
						}
					}
				}
				
			}

	}

}
