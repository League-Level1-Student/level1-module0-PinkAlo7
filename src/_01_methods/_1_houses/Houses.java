package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setX(50);
		rob.setY(500);
		rob.setWindowColor(0,0,0);
		drawHouse("small", "purple");	
		drawHouse("Medium","pink");
	    drawHouse("Very large","yellow");
		drawHouse("tiny","light blue");
        drawHouse("large","red");
		drawHouse("Medium","teal");
		drawHouse("Very large","Maroon");
		drawHouse("small","dark blue");
    	drawHouse("large","brown");
	}
	
	
		// Check the recipe to find out what code to put here

		void drawHouse(String height, String color) {
		int move = 0;
		if(height.equalsIgnoreCase("tiny")) {
			move = 40;
		}
 		if(height.equalsIgnoreCase("small")) {
			move = 60;
		}
		if(height.equalsIgnoreCase("medium")) {
			move = 120;
		}
		if(height.equalsIgnoreCase("large")) {
			move = 250;
		}
		if(height.equalsIgnoreCase("Very large")) {
			move = 300;
		}
		
		if(color.equalsIgnoreCase("purple")) {
			rob.setPenColor(163,2,227);
			}
		if(color.equalsIgnoreCase("pink")) {
			rob.setPenColor(255,56,169);
		}
		if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(241,245,24);
		}
		if(color.equalsIgnoreCase("light blue")) {
			rob.setPenColor(2,215,247);
		}
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(237,5,5);
		}
		if(color.equalsIgnoreCase("teal")) {
			rob.setPenColor(5,250,172); 
				}
		if(color.equalsIgnoreCase("maroon")) {
			rob.setPenColor(156,5,98);
		}
		if(color.equalsIgnoreCase("dark blue")) {
			rob.setPenColor(13,5,171);
		}
		if(color.equalsIgnoreCase("brown")) {
			rob.setPenColor(89,42,8);
		}
		rob.penDown();
		rob.setPenWidth(4);
		rob.setSpeed(20);
		rob.move(move);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		
		rob.move(move);
		rob.turn(-90);
		rob.move(4);
		rob.setPenColor(16,143,20);
		rob.move(17);
		rob.turn(-90);
			}
		
		
		
		
		
		void drawPointyRoof() {
			
			rob.turn(45);
		rob.move(15);
		rob.turn(90);
		rob.move(15);
		rob.turn(45);
		}
		
		void drawFlatRoof() {
			rob.turn(90);
			rob.move(25);
			rob.turn(90);
	
		}
		
}
