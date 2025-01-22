package com.noobprogrammer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int boardWidth = 360;
        int boardHeight = 640;


        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeight);


        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack(); // it doesn't include the size of the title bar
        frame.setVisible(true);
    }
}