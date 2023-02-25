package com.monocept.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private JButton[] buttons;
    private JLabel playerLabel;
    private char[][] board;
    private String player1, player2;
    private boolean player1Turn;
    private boolean gameOver;

    public TicTacToeGUI(String player1, String player2) {
        super("Tic Tac Toe");
        this.player1 = player1;
        this.player2 = player2;
        board = new char[3][3];
        buttons = new JButton[9];
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        playerLabel = new JLabel(player1 + "'s turn");
        player1Turn = true;
        gameOver = false;

        // initialize board and buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char x = (char) ((i * 3 + j + 1) + '0');
                board[i][j] = x;
                buttons[i * 3 + j] = new JButton(Character.toString(board[i][j]));
                buttons[i * 3 + j].addActionListener(this);
                panel.add(buttons[i * 3 + j]);
            }
        }

        add(playerLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) {
            return;
        }
        JButton button = (JButton) e.getSource();
        char c = button.getText().charAt(0);
        if (c == 'X' || c == 'O') {
            JOptionPane.showMessageDialog(this, "The box is already taken, choose another one");
            return;
        }
        int row = (c - 49) / 3;
        int col = (c - 49) % 3;
        button.setText(player1Turn ? "X" : "O");
        board[row][col] = player1Turn ? 'X' : 'O';

        // check for win
        if (didPlayerWin(player1Turn ? 'X' : 'O')) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "Congratualtion " + (player1Turn ? player1 : player2) + ", You won!!");
            return;
        }

        // check for tie
        if (isTie()) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "----------!Game Tie---------");
            return;
        }

        player1Turn = !player1Turn;
        playerLabel.setText((player1Turn ? player1 : player2) + "'s turn");
    }

    public boolean didPlayerWin(char player) {
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player) return true;
        else if (board[1][0] == player && board[1][1] == player && board[1][2] == player) return true;
        else if (board[2][0] == player && board[2][1] == player && board[2][2] == player) return true;
        else if (board[0][0] == player && board[1][0] == player && board[2][0] == player) return true;
        else if (board[0][1] == player && board[1][1] == player && board[2][1] == player) return true;
        else if (board[0][2] == player && board[1][2] == player && board[2][2] == player) return true;
        else if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        else if (board[2][0] == player && board[1][1] == player && board[0][2] == player) return true;
        else return false;
    }
}