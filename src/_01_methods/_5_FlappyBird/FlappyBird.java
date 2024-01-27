package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
        background(52,222,235);
        fill(235,52,213);
        stroke(0,0,0);
        ellipse(594,50,20,20);
        if(mousePressed) {
			println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
	 }  
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
