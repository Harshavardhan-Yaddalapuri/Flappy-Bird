package com.noobprogrammer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {

    int boardWidth = 360;
    int boardHeight = 640;


    // Image Objects
    Image flappyBirdImg;
    Image flappyBirdBGImg;
    Image topPipeImg;
    Image bottomPipeImg;


    // Bird
    int birdX = boardWidth / 8;
    int birdY = boardHeight / 2;
    int birdWidth = 34;
    int birdHeight = 24;


    // Class to hold the bird object
    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    // Game logic
    Bird bird;
    int velocityY = 0;  // adding velocity to make the bird move
    int gravity = 1;

    Timer gameLoop; // To call the paintComponent over and over again


    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setFocusable(true); // Tells the JPanel that this component will be the one listening for KeyEvents
        addKeyListener(this);

        //Loading images
        flappyBirdBGImg = new ImageIcon(getClass().getResource("/assets/flappybirdbg.png")).getImage();
        flappyBirdImg = new ImageIcon(getClass().getResource("/assets/flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("/assets/toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("/assets/bottompipe.png")).getImage();

        // bird
        bird = new Bird(flappyBirdImg);

        // game loop
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        // Drawing the background Image on to the Window
        g.drawImage(flappyBirdBGImg, 0, 0, boardWidth, boardHeight, null);

        // Drawing the Bird Image on to the Window
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
    }


    public void move() {
        // Bird Movement -> the bird moves only in the y-direction and the pipes move in the x-direction
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0); // the bird stops moving as soon as it hits the title bar

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();

    }


    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -9;
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

}
