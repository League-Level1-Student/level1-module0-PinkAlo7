package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int positionX = 594;
	int positionY = 50;
	int birdVelocity = -10;
	int gravity = 1;
	int X = 800;
    Random number = new Random();
	@Override
	public void settings() {

		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
	}

	@Override
	public void draw() {
		background(52, 222, 235);
		positionY += birdVelocity;
		fill(235, 52, 213);
		stroke(0, 0, 0);
		ellipse(positionX, positionY, 20, 20);
		birdVelocity+=gravity;
		fill(10,166,80);
		stroke(0,0,0);
	    X-=1;
	    if(X == 0) {
	    	X = 800;
	    }
	 		rect(X,0,60,200);
        

	if(mousePressed) {
		println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
	
	}
	}
	public void mousePressed() {
	 birdVelocity = -10;
	}
	public void teleportPipes() {
		
	}
	

	static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
