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
		for(int i = 0; i<10;i++) {
		drawHouse("small");	
		drawHouse("Medium");
		drawHouse("Very large");
		drawHouse("tiny");
		drawHouse("large");
		drawHouse("Medium");
		drawHouse("Very large");
		drawHouse("small");
		drawHouse("large");
	}
	}
	
		// Check the recipe to find out what code to put here

		void drawHouse(String height) {
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
	rob.penDown();
	rob.setPenWidth(4);
	rob.setSpeed(20);
	rob.move(move);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(move);
	rob.turn(-90);
	rob.move(17);
	rob.turn(-90);

	
			
}
}
