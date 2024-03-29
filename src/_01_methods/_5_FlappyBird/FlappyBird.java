package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int positionX = 594;
	int positionY = 50;
	int birdVelocity = -9;
	int gravity = 1;
	int X = 800;
	int pipeGap = 80;
	boolean isGameOver = false;
	Random number = new Random();
	int upperPipeHeight = (int) random(100, 400);
	int lowerY = pipeGap + upperPipeHeight;
	int score = 0;

	@Override
	public void settings() {

		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
	}

	@Override
	public void draw() {

		if (positionY >= 540 || intersectsPipes() == true) {
			isGameOver = true;
		} else {
			isGameOver = false;
		}
		if (isGameOver == true) {
			background(0, 0, 0);
			fill(173,34,29);
			textSize(90);
			text("GAME OVER",120,275);
		}
	

		else {
			background(52, 222, 235);
			positionY += birdVelocity;
			fill(235, 52, 213);
			stroke(0, 0, 0);
			ellipse(positionX, positionY, 20, 20);
			birdVelocity += gravity;
			fill(10, 166, 80);
			stroke(0, 0, 0);
			rect(X, 0, 60, upperPipeHeight);
			fill(10, 166, 80);
			stroke(0, 0, 0);
			rect(X, lowerY, 60, 350);
			teleportPipes();
			fill(94, 98, 102);
			stroke(0, 0, 0);
			rect(0, 540, 800, 60);
			fill(0,0,0);
			text("Your score is: " + score, 20,20);
			
			
								
			
		}

	}

	public void mousePressed() {
		birdVelocity = -7;
		println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");

	}

	public void teleportPipes() {

		X -= 1;
		if (X == 0) {
			X = 800;
			upperPipeHeight = (int) random(100, 400);
			lowerY = upperPipeHeight + pipeGap;
			score +=1;
		}

	}

	boolean intersectsPipes() {
		if (positionY < upperPipeHeight && positionX > X && positionX < (X + 80)) {
			return true;
		} else if (positionY > lowerY && positionX > X && positionX < (X + 80)) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
