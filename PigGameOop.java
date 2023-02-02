package com.monocept.model;

import java.util.Scanner;

public class PigGameOop {
    private int playerScore = 0;
    private int turnScore = 0;
    private int roll;
    private Scanner scanner = new Scanner(System.in);

    public void play() {
        while (playerScore < 20) {
            System.out.println("Your current score is " + playerScore);
            System.out.println("Your turn score is " + turnScore);
            System.out.println("Roll or hold? (r/h)");
            String choice = scanner.nextLine();

            if (choice.equals("r")) {
                roll = (int) (Math.random() * 6) + 1;
                if (roll == 1) {
                    turnScore = 0;
                    System.out.println("You rolled a 1, your turn is over and you lose all points for this turn.");
                } else {
                    turnScore += roll;
                    System.out.println("You rolled a " + roll);
                }
            } else if (choice.equals("h")) {
                playerScore += turnScore;
                turnScore = 0;
                System.out.println("You hold and your score is " + playerScore);
            } else {
                System.out.println("Invalid choice, please enter 'r' or 'h'.");
            }
        }
        System.out.println("Congratulations, you won with a score of " + playerScore + "!");
    }
}