package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	//static Robot rob = new Robot();
	Robot rob = new Robot();
	static final int SMALL = 60;
	static final int MEDIUM = 120;
	static final int LARGE = 250;
	public void run() {
		// Check the recipe to find out what code to put here
		
		rob.setX(50);
		rob.setY(500);
			int i = 0;
		while(i<10) {
			drawFlatHouse();
		i++;
		}
	
	
	

	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	}

	private void drawFlatHouse() {
		// TODO Auto-generated method stub
		rob.show();
		rob.penDown();
		rob.setSpeed(10);
		rob.setPenColor(0,255,0);
		rob.turn(90);
		rob.move(40);
		rob.setPenColor(0,0,0);
		rob.turn(-90);
		rob.move(100);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(100);
		rob.turn(-180);

	}
}

