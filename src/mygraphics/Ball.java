package mygraphics;

import java.awt.Color;
import java.awt.Rectangle;

class Ball extends Rectangle {
			
	int vx, vy;		//v = velocity (which means speed)
	int size = 50;
	Color clr = Color.red; // default colour for all balls
	
	Ball(){
		//set x as a random location
		int maxX=TwoBalls.WINW;
		x = (int)(Math.random()*TwoBalls.WINW-100)+50;
		y = 50;
		vx = vy = 6;
		width = height = 30;
	}
}