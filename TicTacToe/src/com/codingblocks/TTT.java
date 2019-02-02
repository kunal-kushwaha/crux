package com.codingblocks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import JFrame from java swing library

public class TTT extends JFrame implements ActionListener {

    public static int BOARD_SIZE = 3;

//  The listener interface for receiving action events.
//  The class that is interested in processing an action event
//  implements this interface, and the object created with that
//  class is registered with a component, using the component's
//  <code>addActionListener</code> method. When the action event
//  occurs, that object's <code>actionPerformed</code> method is
//  invoked.

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        makeMove(clickedButton);
        GameStatus gs = this.getGameStatus();

        if(gs == GameStatus.Incomplete){
            return;
        }
        declareWinner(gs);

        int choice = JOptionPane.showConfirmDialog(this, "Do you want to restart the game?");
        if(choice == JOptionPane.YES_OPTION){
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    buttons[row][col].setText("");
                }
            }
            crossTurn=true;
        }else{
            super.dispose();
        }
    }

    private void declareWinner(GameStatus gs) {
        if(gs == GameStatus.XWins){
            JOptionPane.showMessageDialog(this, "X Wins");
        }else if(gs == GameStatus.ZWins){
            JOptionPane.showMessageDialog(this, "Z Wins");
        }else{
            JOptionPane.showMessageDialog(this, "Tie");
        }
    }

    private GameStatus getGameStatus() {
        String text1 = "";
        String text2 = "";

        int row = 0, col=0;

        // text inside rows
        row = 0;
        while(row < BOARD_SIZE){
            col = 0;
            while(col < BOARD_SIZE - 1){
                text1 = buttons[row][col].getText();
                text2 = buttons[row][col+1].getText();

                if(!text1.equals(text2) || text1.length() == 0){
                    break;
                }
                col++;
            }
            if(col == BOARD_SIZE - 1){
                if(text1.equals("X")){
                    return GameStatus.XWins;
                }else{
                    return GameStatus.ZWins;
                }
            }
            row++;
        }

        // for columns
        col = 0;
        while(col < BOARD_SIZE){
            row = 0;
            while(row < BOARD_SIZE - 1){
                text1 = buttons[row][col].getText();
                text2 = buttons[row+1][col].getText();

                if(!text1.equals(text2) || text1.length() == 0){
                    break;
                }
                row++;
            }
            if(row == BOARD_SIZE - 1){
                if(text1.equals("X")){
                    return GameStatus.XWins;
                }else{
                    return GameStatus.ZWins;
                }
            }
            col++;
        }

        // Diagonal 1
        row = 0;
        col = 0;

        while(row < BOARD_SIZE - 1){
            text1 = buttons[row][col].getText();
            text2 = buttons[row+1][col+1].getText();

            if(!text1.equals(text2) || text1.length() == 0){
                break;
            }
            row++;
            col++;
        }
        if(row == BOARD_SIZE - 1){
            if(text1.equals("X")){
                return GameStatus.XWins;
            }else{
                return GameStatus.ZWins;
            }
        }

        // Diagonal 2
        row = BOARD_SIZE - 1;
        col = 0;

        while(row > 0){
            text1 = buttons[row][col].getText();
            text2 = buttons[row-1][col+1].getText();

            if(!text1.equals(text2) || text1.length() == 0){
                break;
            }
            row--;
            col++;
        }
        if(row == 0){
            if(text1.equals("X")){
                return GameStatus.XWins;
            }else{
                return GameStatus.ZWins;
            }
        }

        String txt = "";
        for (row = 0; row < BOARD_SIZE; row++) {
            for (col = 0; col < BOARD_SIZE; col++) {
                txt = buttons[row][col].getText();
                if(txt.length() == 0){
                    return GameStatus.Incomplete;
                }
            }
        }
        return GameStatus.Tie;
    }

    private void makeMove(JButton clickedButton) {

        String btntext=clickedButton.getText(); // what is written on the button
        if(btntext.length() > 0){
            // button may have X or O
            JOptionPane.showMessageDialog(this, "Invalid Move");
        }else{
            if(crossTurn){
                clickedButton.setText("X");
            }else{
                clickedButton.setText("O");
            }
            crossTurn=!crossTurn;
        }
    }

    public static enum GameStatus{
        Incomplete, XWins, ZWins, Tie
    }

    // A button will be present at each index of the matrix
    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
    boolean crossTurn = true;

    public TTT(){
        // sets title for the frame
        super.setTitle("TicTacToe");
        // 800 pixels
        super.setSize(800,800);

        // make a grid layout on the frame
        GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
        // set layout on frame
        super.setLayout(grid);
        Font font = new Font("Comin Sans", 1, 150);
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JButton button = new JButton("");   // no text on any button
                buttons[row][col]=button;
                button.setFont(font);
                button.addActionListener(this); // listener is attached to every button
                super.add(button);
            }
        }
        super.setResizable(false);  // cannot resize the frame (application window)

        // make the jframe visible
        super.setVisible(true);
    }
}
